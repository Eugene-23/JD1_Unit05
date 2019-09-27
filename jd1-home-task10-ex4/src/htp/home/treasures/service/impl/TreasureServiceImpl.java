package htp.home.treasures.service.impl;

import java.util.ArrayList;
import java.util.List;

import htp.home.treasures.bean.Treasure;
import htp.home.treasures.dao.DAOException;
import htp.home.treasures.dao.DAOProvider;
import htp.home.treasures.dao.TreasureDAO;
import htp.home.treasures.service.ServiceException;
import htp.home.treasures.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {
	
	@Override
	public List<Treasure> takeTreasure() throws ServiceException {
		
		DAOProvider provider = DAOProvider.getInstance();
		TreasureDAO treasureDao = provider.getFileTreasureDao();
		
		List<Treasure> result;
		try {
			result = treasureDao.takeTreasure();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	@Override
	public List<Treasure> findMaxCostTreasures() throws ServiceException {
		
		DAOProvider provider = DAOProvider.getInstance();
		TreasureDAO treasureDao = provider.getFileTreasureDao();
		
		List<Treasure> result = new ArrayList<Treasure>();
		
		int maxCost = 0;
		
		try {
			List<Treasure> listTreasures = treasureDao.takeTreasure();
						
			for (Treasure tr : listTreasures) {
				if (maxCost <= tr.getCost()) {
					maxCost = tr.getCost();
				}
			}
			for (Treasure tr : listTreasures) {
				if (maxCost == tr.getCost()) {
					result.add(tr);
				}
			}			
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
							
		return result;
	}

	@Override
	public List<Treasure> findTreasuresByCost(int cost) throws ServiceException {
		
		DAOProvider provider = DAOProvider.getInstance();
		TreasureDAO treasureDao = provider.getFileTreasureDao();
		
		List<Treasure> result = new ArrayList<Treasure>();
		
		try {
			for (Treasure tr : treasureDao.takeTreasure()) {
				if (cost == tr.getCost()) {
					result.add(tr);
				}
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

}
