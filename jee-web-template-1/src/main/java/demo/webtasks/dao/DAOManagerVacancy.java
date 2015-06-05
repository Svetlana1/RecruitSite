package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.IEntity;
import demo.webtasks.model.Vacancy;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;
import utils.ExpressionSQL;

public class DAOManagerVacancy implements DAOManager<Vacancy> {

	//
	//
	// public void delete(int id) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// EntityDAO.listEntities(ExpressionSQL.DELETE_CATEGORY,
	// new Object[] { id },Vacancy.class);
	//
	// }
	//
	// @Override
	// public void update(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// VacancyVacancy = (Category) obj;
	// EntityDAO.listEntities(ExpressionSQL.UPDATE_CATEGORY, new Object[] {
	// Vacancy.getName(),Vacancy.getPhoto(),Vacancy.getId() },
	// Vacancy.class);
	//
	// }
	//
	// @Override
	// publicVacancy get(int id) {
	// VacancyVacancy = null;
	// try {
	// Vacancy = (Category) EntityDAO.listEntities(
	// ExpressionSQL.GET_CATEGORY_BY_ID, new Object[] { id },
	// Vacancy.class).get(0);
	// } catch (InstantiationException | IllegalAccessException | SQLException
	// e) {
	//
	// e.printStackTrace();
	// }
	// returnVacancy;
	//
	// }
	//
	@Override
	public List<Vacancy> getAll() throws InstantiationException,
			IllegalAccessException, SQLException {
		List<Vacancy> Vacancys = (List<Vacancy>) EntityDAO.listEntities(
				ExpressionSQL.GET_ALL_VACANCY, null, Vacancy.class);

		return Vacancys;
	}

	@Override
	public void add(Vacancy obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Vacancy obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Vacancy obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Vacancy get(int id) {
		Vacancy vacancy = null;
		try {
			vacancy = (Vacancy) EntityDAO.listEntities(
					ExpressionSQL.GET_VACANCY_BY_ID, new Object[] { id },
					Vacancy.class).get(0);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {

			e.printStackTrace();
		}
		return vacancy;
	}

}
