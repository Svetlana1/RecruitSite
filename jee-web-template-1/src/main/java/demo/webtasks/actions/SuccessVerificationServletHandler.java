package demo.webtasks.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessVerificationServletHandler
 */
public class SuccessVerificationServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		gotoToJSP("/success.jsp", request, response);
		
	}
    
}
