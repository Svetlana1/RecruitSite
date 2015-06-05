package demo.webtasks.actions.admin.comment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.webtasks.actions.AbstractWebtasksServletHandler;
import demo.webtasks.dao.DAOManagerComment;

public class AdditionCommentServletHandler{// extends
		//AbstractWebtasksServletHandler {

//	@Override
//	protected void handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		String id = request.getParameter("id");
//		
//		Integer idClient = new Integer(request.getParameter("idClient"));
//		Integer idProduct = new Integer(request.getParameter("idProduct"));
//		String str=request.getParameter("date");
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = formatter.parse(str);
//		
//		String text = request.getParameter("text");
//		DAOManagerComment daoComment = new DAOManagerComment();
//		if (id == null) {
//			Comment Comment = new Comment(idClient, idProduct, date, text);
//			daoComment.add(Comment);
//		} else {
//			
//			Comment comment = daoComment.get(new Integer(id));
//			comment.setIdClient(idClient);
//			comment.setIdProduct(idProduct);
//			comment.setDate(date);
//			comment.setText(text);
//			daoComment.update(comment);
//		}
//		redirectRequest("/user/comment.php", request, response);
//
//	}

}
