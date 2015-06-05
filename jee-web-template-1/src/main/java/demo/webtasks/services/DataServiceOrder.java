package demo.webtasks.services;

import java.sql.SQLException;
import java.util.Date;

import demo.webtasks.model.IEntity;

public interface DataServiceOrder extends IClosable {

	void add(int idClient, int idProduct,	Date date, int discount,
			String typeDelivery, boolean isPayed, boolean isDeliveried,
			String address) throws InstantiationException, IllegalAccessException, SQLException;
	// void delete(int idClient, int idProduct, Date date, int discount, String
	// type_delivery, boolean isPayed, boolean isDeliveried, String address);
}
