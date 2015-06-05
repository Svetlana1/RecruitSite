package demo.webtasks.services;

import java.util.List;

import demo.webtasks.exceptions.InvalidDataException;
import demo.webtasks.exceptions.WebtasksDataException;
import demo.webtasks.model.User;

public interface DataService extends IClosable {

	User login(String username, String password) throws InvalidDataException,
			WebtasksDataException;

	public User register(String email, String password, String name,
			String securiteNumber, Long telephone, String lastName) throws InvalidDataException;
}
