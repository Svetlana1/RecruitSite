package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.User;
import demo.webtasks.model.User;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;
import utils.ExpressionSQL;

public class DAOManagerUser implements DAOManager<User> {

	@Override
	public void add(User user) throws InstantiationException,
			IllegalAccessException, SQLException {
		Object[] objects = { user.getEmail(), user.getPassword(),
				user.getName(), user.getRoleId(), user.getSecuriteNumber(),
				user.getTelephone(), user.getLastName() };
		EntityDAO.listEntities(ExpressionSQL.ADD_CLIENT, objects, User.class);

	}

	@Override
	public void delete(User obj) throws InstantiationException,
			IllegalAccessException, SQLException {

		EntityDAO.listEntities(ExpressionSQL.DELETE_CLIENT, null, User.class);

	}

	public void delete(int id) throws InstantiationException,
			IllegalAccessException, SQLException {

		EntityDAO.listEntities(ExpressionSQL.DELETE_CLIENT,
				new Object[] { id }, User.class);

	}

	@Override
	public void update(User obj) throws InstantiationException,
			IllegalAccessException, SQLException {

		User user = (User) obj;
		EntityDAO.listEntities(
				ExpressionSQL.UPDATE_CLIENT,
				new Object[] { user.getEmail(), user.getName(),
						user.getPassword(), user.getIsActive(), user.getId() },
				User.class);

	}

	@Override
	public User get(int id) {
		User user = null;
		try {
			user = (User) EntityDAO.listEntities(
					ExpressionSQL.GET_CLIENT_BY_ID, new Object[] { id },
					User.class).get(0);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {

			e.printStackTrace();
		}
		return user;

	}

	@Override
	public List<User> getAll() throws InstantiationException,
			IllegalAccessException, SQLException {
		List<User> Users = (List<User>) EntityDAO.listEntities(
				ExpressionSQL.GET_ALL_CLIENT, null, User.class);

		return Users;

	}

	public User getLogin(String email) throws InstantiationException,
			IllegalAccessException, SQLException {
		User user = null;

		List<User> temp = (List<User>) EntityDAO.listEntities(
				ExpressionSQL.GET_LOGIN_CLIENT, new Object[] { email },
				User.class);
		if (temp != null && !temp.isEmpty()) {
			user = (User) temp.get(0);
		}
		return user;

	}

}
