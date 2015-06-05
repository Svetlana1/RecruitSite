package demo.webtasks.services;

public interface AsyncService extends IClosable{

	public void submit(Runnable run);
}
