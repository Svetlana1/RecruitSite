package demo.webtasks.actions.employer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.model.User;

public class UpdateUserServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
		User user=new DAOManagerUser().get(new Integer(id));
		request.setAttribute("user", user);
//		request.setAttribute("name", name);
//		request.setAttribute("email", email);
//		request.setAttribute("password", password);
		gotoToJSP("/registration.jsp", request, response);

	}

}
