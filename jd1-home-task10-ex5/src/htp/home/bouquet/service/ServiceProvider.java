package htp.home.bouquet.service;

import htp.home.bouquet.service.impl.FlowerServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private ServiceProvider() {}
	
	private FlowerService flowerService = new FlowerServiceImpl();

	public FlowerService getFlowerService() {
		return flowerService;
	}
	
	
}
