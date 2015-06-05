package demo.webtasks.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import demo.algorithm.Sha;
import demo.webtasks.WebtasksConstants;
import demo.webtasks.exceptions.InvalidDataException;
import demo.webtasks.model.User;

public class LoginServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 4544737546336836686L;

	private final Map<Integer, String> homePages = new HashMap<Integer, String>();

	public LoginServletHandler() {

		homePages.put(ROLE_EMPLOYER, "/employer/home_employer.php");
		homePages.put(ROLE_EMPLOYEE, "/employee/home.php");

	}

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if (request.getMethod().equals("GET")) {
			showLoginPage(request, response);
		} else {
			loginHandler(request, response);
		}
	}

	protected void showLoginPage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		gotoToJSP("/login.jsp", request, response);
	}

	protected void validateRequest(String email, String password)
			throws InvalidDataException {
		if (StringUtils.isBlank(email)) {
			throw new InvalidDataException("Email is blank");
		}
		if (StringUtils.isBlank(password)) {
			throw new InvalidDataException("Password is blank");
		}
	}

	protected void loginHandler(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		password = Sha.sha1(password);

		// LOCALE
		// HttpSession session=request.getSession();
		// session.setAttribute("loc", new Locale("en"));

		// response.setLocale(loc);
		try {
			validateRequest(email, password);
			User user = getDataService().login(email, password);
			if (user.getIsActive() == 0) {
				gotoToJSP("/invalid_registration.jsp", request, response);

			} else {
				String homePage = null;
				if (user.getRoleId() == WebtasksConstants.ROLE_EMPLOYER) {
					homePage = homePages.get(ROLE_EMPLOYER);
				} else {
					homePage = homePages.get(ROLE_EMPLOYEE);
				}

				if (homePage != null) {
					HttpSession session = request.getSession();
					session.setAttribute(CURRENT_SESSION_USER, user);
					session.setAttribute("idUser", user.getId());
					session.setAttribute("user", user);
					redirectRequest(homePage, request, response);
				} else {
					throw new InvalidDataException("Invalid data");
				}
			}
		} catch (InvalidDataException e) {
			request.setAttribute(WebtasksConstants.VALIDATION_MESSAGE,
					e.getMessage());
			gotoToJSP("/login.jsp", request, response);
		}
	}
}
