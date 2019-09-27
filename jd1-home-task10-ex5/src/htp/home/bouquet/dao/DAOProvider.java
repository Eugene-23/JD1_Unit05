package htp.home.bouquet.dao;

import htp.home.bouquet.dao.impl.FileFlowerDAO;
import htp.home.bouquet.dao.impl.FilePackgingDAO;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();
	
	public static DAOProvider getInstance() {
		return instance;
	}	
	
	private DAOProvider() {}	
	
	private FlowerDAO fileFlowerDao = new FileFlowerDAO();
	private PackgingDAO filePackgingDAO = new FilePackgingDAO();
	
	
	public FlowerDAO getFileFlowerDao() {
		return fileFlowerDao;
	}

	public PackgingDAO getFilePackgingDAO() {
		return filePackgingDAO;
	}
	
}
