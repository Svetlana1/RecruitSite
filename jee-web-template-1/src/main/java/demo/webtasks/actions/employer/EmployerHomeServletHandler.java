package demo.webtasks.actions.employer;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledge;
import demo.webtasks.dao.DAOManagerComment;
import demo.webtasks.dao.DAOManagerOrder;
import demo.webtasks.dao.DAOManagerUser;

public class EmployerHomeServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 2821398058404801717L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// HttpSession session = request.getSession();
		// session.setAttribute("users", new DAOManagerUser().getAll());
		// session.setAttribute("categories", new
		// DAOManagerCategory().getAll());
		// session.setAttribute("products", new DAOManagerProduct().getAll());
		// session.setAttribute("orders", new DAOManagerOrder().getAll());
		// session.setAttribute("comments", new DAOManagerComment().getAll());
		//request.setAttribute("users", new DAOManagerUser().getAll());
		gotoToJSP("/employer/resumes_employees.jsp", request, response);
	}
}
