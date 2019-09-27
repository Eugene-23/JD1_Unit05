package htp.home.bouquet.service.impl;

import htp.home.bouquet.bean.Flower;
import htp.home.bouquet.bean.Packaging;
import htp.home.bouquet.dao.DAOException;
import htp.home.bouquet.dao.DAOProvider;
import htp.home.bouquet.dao.FlowerDAO;
import htp.home.bouquet.dao.PackgingDAO;
import htp.home.bouquet.service.FlowerService;
import htp.home.bouquet.service.ServiceException;


public class FlowerServiceImpl implements FlowerService {

	@Override
	public Flower addHomeFlower() throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		FlowerDAO flowerDao = provider.getFileFlowerDao();
		
		Flower newFlower;
		try {
			newFlower = flowerDao.takeHomeFlower();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return newFlower;
	}
	
	@Override
	public Flower addWildFlower() throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		FlowerDAO flowerDao = provider.getFileFlowerDao();
		
		Flower newFlower;
		try {
			newFlower = flowerDao.takeWildFlower();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return newFlower;
	}

	@Override
	public Packaging addPackaging() throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		PackgingDAO packgingDAO = provider.getFilePackgingDAO();
		
		Packaging packaging;
		try {
			packaging = packgingDAO.takePackaging();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return packaging;
	}	

}
