package demo.webtasks.services.mocks;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;

import demo.webtasks.services.DataService;
import demo.webtasks.services.EmailService;

public final class WebtasksServiceManager {
	private static final Logger LOGGER = Logger
			.getLogger(WebtasksServiceManager.class);
	private static final String WEBTASKS_SERVICES_MANAGER = "WEBTASKS_SERVICES_MANAGER";
	private static final WebtasksServiceManager INSTANCE = new WebtasksServiceManager();

	private WebtasksServiceManager() {
		init();
	}

	public static WebtasksServiceManager getInstance(ServletContext context) {
		WebtasksServiceManager instance = (WebtasksServiceManager) context
				.getAttribute(WEBTASKS_SERVICES_MANAGER);
		if (instance == null) {
			context.setAttribute(WEBTASKS_SERVICES_MANAGER, INSTANCE);
			instance = INSTANCE;
		}
		return instance;
	}

	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

	private EmailService emailService;

	public EmailService getEmailService() {
		return emailService;
	}

	private void init() {

		emailService = new EmailServiceImp();
		dataService = new DataServiceImpl(emailService);
	}

	public void startAllServices() {
		LOGGER.info("All services have been started");
	}

	public void closeAllServices() {
		dataService.close();
		LOGGER.info("All services have been closed");
	}
}
