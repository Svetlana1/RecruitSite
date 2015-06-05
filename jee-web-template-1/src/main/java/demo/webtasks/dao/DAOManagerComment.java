package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.IEntity;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;
import utils.ExpressionSQL;

public class DAOManagerComment {

	// @Override
	// public void add(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void delete(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// public void delete(int id) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// EntityDAO.listEntities(ExpressionSQL.DELETE_COMMENT,
	// new Object[] { id }, Comment.class);
	//
	// }
	//
	// @Override
	// public void update(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// Comment comment = (Comment) obj;
	// EntityDAO.listEntities(ExpressionSQL.UPDATE_COMMENT, new Object[] {
	// comment.getIdClient(), comment.getIdProduct(), comment.getDate(),
	// comment.getText(), comment.getId() },
	// Comment.class);
	//
	// }
	//
	// @Override
	// public Comment get(int id) {
	// Comment comment = null;
	// try {
	// comment = (Comment) EntityDAO.listEntities(
	// ExpressionSQL.GET_COMMENT_BY_ID, new Object[] { id },
	// Comment.class).get(0);
	// } catch (InstantiationException | IllegalAccessException | SQLException
	// e) {
	//
	// e.printStackTrace();
	// }
	// return comment;
	//
	//
	// }
	//
	// @Override
	// public List getAll() throws InstantiationException,
	// IllegalAccessException,
	// SQLException {
	// List<Comment> comments = (List<Comment>) EntityDAO.listEntities(
	// ExpressionSQL.GET_ALL_COMMENT, null, Comment.class);
	//
	// return comments;
	// }

}
