package demo.webtasks.services.mocks;

import demo.webtasks.dao.DAOManagerUser;
import demo.webtasks.exceptions.InvalidDataException;
import demo.webtasks.model.User;
import demo.webtasks.services.DataService;
import demo.webtasks.services.EmailService;

public class DataServiceImpl implements DataService {

	private EmailService emailService;

	public DataServiceImpl(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	@Override
	public User login(String email, String password)
			throws InvalidDataException {
		User user = null;
		try {

			user = new DAOManagerUser().getLogin(email);
		} catch (Exception e) {
			throw new InvalidDataException("Can get login client");
		}
		if (user == null) {
			throw new InvalidDataException("User not found");
		}
		if (user != null && user.getPassword().equals(password)) {
			return user;
		} else if (!user.getPassword().equals(password)) {
			throw new InvalidDataException("Invalid password");
		}
		throw new InvalidDataException("User not found");

	}

	public User register(String email, String password, String name,
			String securiteNumber, Long telephone, String lastName) throws InvalidDataException {
		User user = new User(email, password, name, 2, securiteNumber, telephone, lastName);
		try {

			new DAOManagerUser().add(user);
			// emailService.sendEmail(email, "headerMessage", "message");
		} catch (Exception e) {
			throw new InvalidDataException("Can not add client");
		}
		return user;
	}

	@Override
	public void close() {

	}

	
}
