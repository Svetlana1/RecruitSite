package demo.webtasks.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.model.User;

/**
 * Servlet implementation class VerificationServletHandler
 */
public class VerificationServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DAOManagerUser daoUser=new DAOManagerUser();
		String email = request.getParameter("email");
		String securiteNumber = request.getParameter("securiteNumber");
		User user=daoUser.getLogin(email);
		if(user.getSecuriteNumber().equals(securiteNumber)){
			user.setIsActive(1);
			daoUser.update(user);
			redirectRequest("/success.php", request, response);
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */

}
