package demo.webtasks.actions.employee;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledgeUser;
import demo.webtasks.dao.DAOManagerResume;
import demo.webtasks.model.KnowledgeUser;
import demo.webtasks.model.Resume;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreationResumeServletHandler
 */
public class CreationResumeServletHandler extends
		AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if (request.getMethod().equals("GET")) {
			gotoToJSP("/employee/resume.jsp", request, response);
		} else {
			createResume(request, response);
		}
	}

	protected void createResume(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		String vacancy = request.getParameter("vacancy");
		String education = request.getParameter("education");
		String[] knowledges = request.getParameterValues("knowledge");
		String driveLicense = request.getParameter("driveLicense");
		String qualification = request.getParameter("qualification");
		String workExperience = request.getParameter("workExperience");
		String professionalSummary = request
				.getParameter("professionalSummary");
		String experienceAge = request.getParameter("experienceAge");
		Resume resume = new Resume(Integer.parseInt(experienceAge), education,
				Integer.parseInt(driveLicense), qualification, workExperience,
				professionalSummary, Integer.parseInt(vacancy));
		try {
			new DAOManagerResume().add(resume);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}
		int idUser = (int) session.getAttribute("idUser");
		DAOManagerKnowledgeUser daoManagerKnowledgeUser = new DAOManagerKnowledgeUser();
		for (String knowledge : knowledges) {
			KnowledgeUser knowledgeUser = new KnowledgeUser(
					Integer.parseInt(knowledge), idUser);

			try {
				daoManagerKnowledgeUser.add(knowledgeUser);
			} catch (InstantiationException | IllegalAccessException
					| SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			redirectRequest("/employee/showResume.php", request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
