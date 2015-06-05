package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import utils.ExpressionSQL;
import demo.webtasks.model.IEntity;
import demo.webtasks.model.Resume;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;

/*import demo.webtasks.model.Product;
 import demo.webtasks.model.IEntity;
 import demo.webtasks.model.Product;*/

public class DAOManagerResume implements DAOManager<Resume> {
	//
	@Override
	public void add(Resume resume) throws InstantiationException,
			IllegalAccessException, SQLException {

		Object[] objects = { resume.getExperienceAge(), resume.getEducation(),
				resume.getDriveLicense(), resume.getQualifications(),
				resume.getWorkExperience(), resume.getProfessionalSummary(),
				resume.getVacancyId() };
		EntityDAO.listEntities(ExpressionSQL.ADD_RESUME, objects, Resume.class);

	}

	@Override
	public void delete(Resume obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Resume obj) throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Resume get(int id) {
		Resume resume = null;
		try {
			resume = (Resume) EntityDAO.listEntities(
					ExpressionSQL.GET_RESUME_BY_USER_ID, new Object[] { id },
					Resume.class).get(0);
		} catch (InstantiationException | IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}
		return resume;
	}

	@Override
	public List<Resume> getAll() throws InstantiationException,
			IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	//
	// @Override
	// public void delete(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	//
	// Product product = (Product) obj;
	// Object[] objects = { product.getDescription(), product.getPhoto(),
	// product.getName(), product.getCategoryId(),
	// product.getPricePurchase(), product.getPriceSale(),
	// product.getCount() };
	// EntityDAO
	// .listEntities(ExpressionSQL.DELETE_CLIENT, objects, User.class);
	//
	// }
	//
	// public void delete(int id) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// EntityDAO.listEntities(ExpressionSQL.DELETE_PRODUCT,
	// new Object[] { id }, Product.class);
	//
	// }
	//
	// @Override
	// public void update(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	//
	// Product product = (Product) obj;
	// Object[] objects = { product.getDescription(), product.getPhoto(),
	// product.getName(), product.getCategoryId(),
	// product.getPricePurchase(), product.getPriceSale(),
	// product.getCount(), product.getId() };
	// EntityDAO.listEntities(ExpressionSQL.UPDATE_PRODUCT, objects,
	// User.class);
	//
	// }
	//
	// @Override
	// public Product get(int id) {
	// Product product = null;
	// try {
	// product = (Product) EntityDAO.listEntities(
	// ExpressionSQL.GET_PRODUCT_BY_ID, new Object[] { id },
	// Product.class).get(0);
	// } catch (InstantiationException | IllegalAccessException | SQLException
	// e) {
	//
	// e.printStackTrace();
	// }
	// return product;
	//
	// }
	//
	// @Override
	// public List<Product> getAll() throws InstantiationException,
	// IllegalAccessException, SQLException {
	// List<Product> products = (List<Product>) EntityDAO.listEntities(
	// ExpressionSQL.GET_ALL_PRODUCT, null, Product.class);
	//
	// return products;
	//
	// }

}
