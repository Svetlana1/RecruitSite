package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.IEntity;
import demo.webtasks.model.Role;
import demo.webtasks.model.User;
import demo.webtasks.services.mocks.EntityDAO;
import utils.ExpressionSQL;

public class DAOManagerRole {

	public int get(String name) {
		Role role = null;
		try {
			role = (Role) EntityDAO.listEntities(ExpressionSQL.GET_ROLE_ID,
					new Object[] { name }, Role.class).get(0);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}
		int id=0;
		if (role != null) {
			id = role.getId();
		}
		return id;
	}
}
