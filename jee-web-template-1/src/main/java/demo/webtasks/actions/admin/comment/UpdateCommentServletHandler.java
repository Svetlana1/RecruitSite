package demo.webtasks.actions.admin.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerComment;
import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.model.User;

public class UpdateCommentServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;

	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		//
		// Comment Comment = new DAOManagerComment().get(new Integer(id));
		// request.setAttribute("comment", Comment);
		// gotoToJSP("/admin/add_edit_comment.jsp", request, response);

	}

}
