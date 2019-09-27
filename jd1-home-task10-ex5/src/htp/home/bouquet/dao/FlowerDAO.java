package htp.home.bouquet.dao;

import htp.home.bouquet.bean.HomeFlower;
import htp.home.bouquet.bean.WildFlower;

public interface FlowerDAO {
	
	public WildFlower takeWildFlower() throws DAOException;
	
	public HomeFlower takeHomeFlower() throws DAOException;

}
