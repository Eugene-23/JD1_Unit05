package htp.home.bouquet.service;

import htp.home.bouquet.bean.Flower;
import htp.home.bouquet.bean.Packaging;

public interface FlowerService {
	
	public Flower addHomeFlower() throws ServiceException;
	
	public Flower addWildFlower() throws ServiceException;
	
	public Packaging addPackaging() throws ServiceException;
			
}
