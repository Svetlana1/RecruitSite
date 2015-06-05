package demo.webtasks.actions.admin.comment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;

public class CommentAdminServletHandler extends  AbstractWebtasksServletHandler{

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		redirectRequest("/user/comment.php", request, response);
	}

}
