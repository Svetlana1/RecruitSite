package demo.webtasks.actions.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;

public class MaxResumePageServletHandler  extends
 AbstractWebtasksServletHandler {

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		gotoToJSP("/employee/resumeMax.jsp", request, response);

	}

}
