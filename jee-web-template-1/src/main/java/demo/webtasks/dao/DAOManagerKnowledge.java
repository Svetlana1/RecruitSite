package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.IEntity;
import demo.webtasks.model.Knowledge;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;
import utils.ExpressionSQL;

public class DAOManagerKnowledge {// implements DAOManager<Knowledge> {

	//
	//
	// public void delete(int id) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// EntityDAO.listEntities(ExpressionSQL.DELETE_CATEGORY,
	// new Object[] { id }, Category.class);
	//
	// }
	//
	// @Override
	// public void update(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// Category category = (Category) obj;
	// EntityDAO.listEntities(ExpressionSQL.UPDATE_CATEGORY, new Object[] {
	// category.getName(), category.getPhoto(), category.getId() },
	// Category.class);
	//
	// }
	//
	// @Override
	// public Category get(int id) {
	// Category category = null;
	// try {
	// category = (Category) EntityDAO.listEntities(
	// ExpressionSQL.GET_CATEGORY_BY_ID, new Object[] { id },
	// Category.class).get(0);
	// } catch (InstantiationException | IllegalAccessException | SQLException
	// e) {
	//
	// e.printStackTrace();
	// }
	// return category;
	//
	// }
	//

	public List<Knowledge> getAll() throws InstantiationException,
			IllegalAccessException, SQLException {
		List<Knowledge> knowledges = (List<Knowledge>) EntityDAO.listEntities(
				ExpressionSQL.GET_ALL_KNOWLEDGE, null, Knowledge.class);

		return knowledges;
	}

	public void add(Knowledge obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	public void delete(Knowledge obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	public void update(Knowledge obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	public List<Knowledge> get(int id) {
		List<Knowledge> knowledges = null;
		try {
			knowledges = (List<Knowledge>) EntityDAO.listEntities(
					ExpressionSQL.GET_KNOWLEDGE_BY_USER_ID,
					new Object[] { id }, Knowledge.class);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}
		return knowledges;
	}

}
