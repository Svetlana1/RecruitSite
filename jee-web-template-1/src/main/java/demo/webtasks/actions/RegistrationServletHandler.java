package demo.webtasks.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;

import demo.algorithm.CaptchaResponse;
import demo.algorithm.Sha;
import demo.webtasks.WebtasksConstants;
import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.exceptions.InvalidDataException;
import demo.webtasks.model.User;
import demo.webtasks.services.mocks.AsyncServiceImpl;

public class RegistrationServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	private String secretParameter = "6LeJOAMTAAAAAM0jleS-RyldJlCjwV9-Ssk4Qc9b";

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if (request.getMethod().equals("GET")) {
			showRegistrationPage(request, response);
		} else {
			registrationHandler(request, response);
		}

	}

	protected void showRegistrationPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		gotoToJSP("/registration.jsp", request, response);

	}

	private void registrationHandler(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			NoSuchAlgorithmException, InstantiationException,
			IllegalAccessException, SQLException, InvalidDataException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastName");
		String telephone = request.getParameter("telephone");
		Long telephoneNum = Long.valueOf(telephone);
		final String email = request.getParameter("email");
		String password = request.getParameter("password");
		final String securiteNumber = UUID.randomUUID().toString();
		String confirmPassword = request.getParameter("confirmPassword");
		Object obj = request.getSession().getAttribute("user");
		if (!checkReCapture(request)) {
			throw new InvalidDataException("You are a robot!");
		}
		try {
			validateRequest(name, email, password, confirmPassword);
			password = Sha.sha1(password);
			if (obj != null) {
				DAOManagerUser daoUser = new DAOManagerUser();
				User user = (User) obj;

				if (user.getRoleId() == 1) {
					User userEdit = daoUser.get(new Integer(id));
					userEdit.setEmail(email);
					userEdit.setName(name);
					userEdit.setPassword(password);
					new DAOManagerUser().update(userEdit);
					redirectRequest("/employer/home.php", request, response);
				} else {
					user.setEmail(email);
					user.setName(name);
					user.setPassword(password);
					new DAOManagerUser().update(user);
					redirectRequest("/employee/home.php", request, response);
				}

			} else {
				final User user = getDataService().register(email, password,
						name, securiteNumber, telephoneNum, lastName);
				new AsyncServiceImpl().submit(new Runnable() {

					@Override
					public void run() {
						getEmailService().sendEmail(user, "headerMessage",
								"message");
					}
				});

				gotoToJSP("/after_registration.jsp", request, response);
			}

		} catch (InvalidDataException e) {
			request.setAttribute(WebtasksConstants.VALIDATION_MESSAGE,
					e.getMessage());
			gotoToJSP("registration.jsp", request, response);
		}

	}

	private void validateRequest(String name, String email, String password,
			String confirmPassword) throws InvalidDataException {
		if (StringUtils.isBlank(name)) {
			throw new InvalidDataException("Name is blank");
		}
		if (StringUtils.isBlank(email)) {
			throw new InvalidDataException("Email is blank");
		}
		if (StringUtils.isBlank(password)) {
			throw new InvalidDataException("Password is blank");
		}
		if (StringUtils.isBlank(confirmPassword)) {
			throw new InvalidDataException("Confirm password is blank");
		}
		if (!confirmPassword.equals(password)) {
			throw new InvalidDataException(
					"Password is not equals Confirm password");
		}

	}

	private boolean checkReCapture(HttpServletRequest request)
			throws IOException {
		String recap = request.getParameter("g-recaptcha-response");

		// Send get request to Google reCaptcha server with secret key
		URL url = new URL(
				"https://www.google.com/recaptcha/api/siteverify?secret="
						+ secretParameter + "&response=" + recap + "&remoteip="
						+ request.getRemoteAddr());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		String line, outputString = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		while ((line = reader.readLine()) != null) {
			outputString += line;
		}

		// Convert response into Object
		CaptchaResponse capRes = new Gson().fromJson(outputString,
				CaptchaResponse.class);

		// Verify whether the input from Human or Robot
		// if(capRes.isSuccess()) {
		// // Input by Human
		// request.setAttribute("verified", "true");
		// } else {
		// // Input by Robot
		// request.setAttribute("verified", "false");
		// }
		return capRes.isSuccess();
	}

	/**
	 * Default constructor.
	 */

}
