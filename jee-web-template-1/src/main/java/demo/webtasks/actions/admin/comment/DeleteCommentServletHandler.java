package demo.webtasks.actions.admin.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerKnowledge;
import demo.webtasks.dao.DAOManagerComment;
import demo.webtasks.dao.DAOManagerUser;


public class DeleteCommentServletHandler extends AbstractWebtasksServletHandler {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteCommentServletHandler() {
        super();
       
    }


	@Override
	protected void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
//		
//		new DAOManagerComment().delete(new Integer(request.getParameter("id")));
//		redirectRequest("/user/comment.php", request, response);
		
	}

	


}
