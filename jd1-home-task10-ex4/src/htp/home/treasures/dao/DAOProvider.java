package htp.home.treasures.dao;

import htp.home.treasures.dao.impl.FileTreasureDAO;

public class DAOProvider {
	
	private static final DAOProvider instance = new DAOProvider();
	
	public static DAOProvider getInstance() {
		return instance;
	}
	
	private DAOProvider() {		
	}

	private TreasureDAO fileTreasureDao = new FileTreasureDAO();

	public TreasureDAO getFileTreasureDao() {
		return fileTreasureDao;
	}

	public void setFileTreasureDao(TreasureDAO fileTreasureDao) {
		this.fileTreasureDao = fileTreasureDao;
	}
	
}
