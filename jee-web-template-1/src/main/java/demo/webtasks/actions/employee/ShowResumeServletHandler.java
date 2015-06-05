package demo.webtasks.actions.employee;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledge;
import demo.webtasks.dao.DAOManagerResume;
import demo.webtasks.dao.DAOManagerVacancy;
import demo.webtasks.model.Knowledge;
import demo.webtasks.model.Resume;
import demo.webtasks.model.Vacancy;

/**
 * The File servlet for serving from absolute path.
 * 
 * @author BalusC
 * @link http://balusc.blogspot.com/2007/07/fileservlet.html
 */
public class ShowResumeServletHandler extends AbstractWebtasksServletHandler {

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(false);
		int userId = (int) session.getAttribute("idUser");
		Resume resume = new DAOManagerResume().get(userId);
		List<Knowledge> knowledges = new DAOManagerKnowledge().get(userId);
		Vacancy vacancy = new DAOManagerVacancy().get(resume.getVacancyId());
		session.setAttribute("knowledges", knowledges);
		session.setAttribute("resume", resume);
		session.setAttribute("vacancy", vacancy);
		gotoToJSP("/employee/resumeTemplate.jsp", request, response);

	}

}
