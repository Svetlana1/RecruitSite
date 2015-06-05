package demo.webtasks.services.mocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import demo.webtasks.services.AsyncService;

public class AsyncServiceImpl implements AsyncService {

	private ExecutorService executerService;
	
	public AsyncServiceImpl() {
		executerService = Executors.newFixedThreadPool(3);
	}
	
	@Override
	public void submit(Runnable run) {
		executerService.submit(run);
	}

	@Override
	public void close() {
		executerService.shutdown();
	}
}
