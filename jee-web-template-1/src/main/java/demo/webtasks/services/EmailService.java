package demo.webtasks.services;

import demo.webtasks.model.User;

public interface EmailService {

	public void sendEmail(User user, String headerMessage, String message);

}
