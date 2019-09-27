package htp.home.treasures.service;

import htp.home.treasures.service.impl.TreasureServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private ServiceProvider() {		
	}

	private TreasureService treasureServiceImpl = new TreasureServiceImpl();
	
	public TreasureService getTreasureServiceImpl() {
		return treasureServiceImpl;
	}
}
