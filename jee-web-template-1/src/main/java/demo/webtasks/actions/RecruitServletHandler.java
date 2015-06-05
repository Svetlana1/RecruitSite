package demo.webtasks.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecruitServletHandler extends AbstractWebtasksServletHandler {

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		gotoToJSP("/recruit.jsp", request, response);
	}

}
