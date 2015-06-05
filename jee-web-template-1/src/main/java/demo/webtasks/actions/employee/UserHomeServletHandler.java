package demo.webtasks.actions.employee;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledge;
import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.dao.DAOManagerVacancy;
import demo.webtasks.model.Knowledge;
import demo.webtasks.model.User;
import demo.webtasks.model.Vacancy;

public class UserHomeServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 2821398058404801717L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int id = (int) request.getSession().getAttribute("idUser");
		User user = new DAOManagerUser().get(id);
		List<Knowledge> knowledges = new DAOManagerKnowledge().getAll();
		request.setAttribute("knowledges", knowledges);
		// request.setAttribute("selectedKnowledge", "Engl" );
		List<Vacancy> vacances = new DAOManagerVacancy().getAll();
		request.setAttribute("vacances", vacances);
		if (user.getRoleId() == 1) {
			gotoToJSP("/employer/resume.jsp", request, response);
		} else {
			gotoToJSP("/employee/resume.jsp", request, response);
		}
	}
}
