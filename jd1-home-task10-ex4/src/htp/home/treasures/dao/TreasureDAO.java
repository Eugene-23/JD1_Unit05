package htp.home.treasures.dao;

import java.util.List;

import htp.home.treasures.bean.Treasure;

public interface TreasureDAO {
	
	public List<Treasure> takeTreasure () throws DAOException;
	
}
