package demo.webtasks.services.mocks;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;

import demo.algorithm.EmailTemplate;
import demo.webtasks.model.User;
import demo.webtasks.services.EmailService;

public class EmailServiceImp implements EmailService {

	private static final Logger log = Logger.getLogger(EmailServiceImp.class);

	@Override
	public void sendEmail(User user, String headerMessage, String message) {
		try {
			HtmlEmail em = new HtmlEmail();
			em.setAuthenticator(new DefaultAuthenticator(
					"recruitsite71@gmail.com", "recruitsite71123"));
			em.setTLS(true);
			em.setHostName("smtp.gmail.com");
			em.setSmtpPort(587);
			em.setFrom("recruitsite71@gmail.com");
			em.setSubject("TestMail");
			String link = "http://localhost:8080/webtasks/login.php";
			em.setCharset("UTF-8");
			String text = EmailTemplate.getEmailTemplate(user);
			em.setHtmlMsg(text);
			em.setTextMsg("Your email client does not support HTML messages");
			em.addTo(user.getEmail());
			em.send();
		} catch (EmailException e) {
			log.error("Email not", e);
		}

	}

}
