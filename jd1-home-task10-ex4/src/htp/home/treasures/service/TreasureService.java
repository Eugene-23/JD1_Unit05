package htp.home.treasures.service;

import java.util.List;

import htp.home.treasures.bean.Treasure;

public interface TreasureService {
	
	public List<Treasure> takeTreasure () throws ServiceException;
	
	public List<Treasure> findMaxCostTreasures() throws ServiceException;
	
	public List<Treasure> findTreasuresByCost(int cost) throws ServiceException;

}
