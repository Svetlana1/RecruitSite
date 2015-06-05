package demo.webtasks.services;

import java.sql.SQLException;
import java.util.List;

import demo.webtasks.model.IEntity;


public interface DAOManager<T extends IEntity> {// extends IClosable {

	void add(T obj) throws InstantiationException, IllegalAccessException, SQLException;

	void delete(T obj) throws InstantiationException, IllegalAccessException, SQLException;

	void update(T obj) throws InstantiationException, IllegalAccessException, SQLException;

	T get(int id);

	List<T> getAll() throws InstantiationException, IllegalAccessException, SQLException;
}
