package demo.webtasks.dao;

import java.sql.SQLException;
import java.util.List;

import utils.ExpressionSQL;
import demo.webtasks.model.IEntity;
import demo.webtasks.services.DAOManager;
import demo.webtasks.services.mocks.EntityDAO;

public class DAOManagerOrder {

	// public List<OrderClient> getAllByOrder(int id) throws
	// InstantiationException,
	// IllegalAccessException, SQLException {
	// List<OrderClient> orders = (List<OrderClient>) EntityDAO.listEntities(
	// ExpressionSQL.GET_ALL_ORDER_BY_CLIENT, new Object[] { id },
	// OrderClient.class);
	//
	// return orders;
	//
	// }
	//
	// @Override
	// public Order get(int id) {
	// Order order = null;
	// try {
	// order = (Order) EntityDAO.listEntities(
	// ExpressionSQL.GET_ORDER_BY_ID, new Object[] { id },
	// Order.class).get(0);
	// } catch (InstantiationException | IllegalAccessException | SQLException
	// e) {
	//
	// e.printStackTrace();
	// }
	// return order;
	// }
	//
	// @Override
	// public List getAll() throws InstantiationException,
	// IllegalAccessException,
	// SQLException {
	// List<Order> orders = (List<Order>) EntityDAO.listEntities(
	// ExpressionSQL.GET_ALL_ORDER, null, Order.class);
	//
	// return orders;
	// }
	//
	// @Override
	// public void add(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// Order order=(Order)obj;
	// Object [] objects={order.getIdClient(), order.getIdProduct(),
	// order.getDateOrder(), order.getDiscount(), order.getTypeDelivery(),
	// order.getIsPayed(), order.getIsDeliveried(), order.getAddress()};
	// EntityDAO.listEntities(ExpressionSQL.ADD_ORDER, objects,
	// Order.class);
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
	// EntityDAO.listEntities(ExpressionSQL.DELETE_ORDER, new Object[] { id },
	// Order.class);
	// }
	//
	// @Override
	// public void update(IEntity obj) throws InstantiationException,
	// IllegalAccessException, SQLException {
	// Order order = (Order) obj;
	//
	// EntityDAO.listEntities(
	// ExpressionSQL.UPDATE_ORDER,
	// new Object[] { order.getIdClient(), order.getIdProduct(),
	// order.getDateOrder(), order.getDiscount(),
	// order.getTypeDelivery(), order.getIsPayed(),
	// order.getIsDeliveried(), order.getAddress(), order.getId() },
	// Order.class);
	//
	// }
}
