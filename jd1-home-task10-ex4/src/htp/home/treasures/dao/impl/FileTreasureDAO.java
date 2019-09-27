package htp.home.treasures.dao.impl;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import htp.home.treasures.bean.Treasure;
import htp.home.treasures.dao.DAOException;
import htp.home.treasures.dao.TreasureDAO;

public class FileTreasureDAO implements TreasureDAO {
		
	private static final String SOURCE = "resources/cave.txt";
	
	@Override
	public List<Treasure> takeTreasure() throws DAOException {

		List<Treasure> cave = new ArrayList<Treasure>();
		FileReader reader;
		
		try {
			reader = new FileReader(SOURCE);
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(reader);
			
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				cave.add(newTreasure(str));
			}
			
			reader.close();
			
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return cave;
	}
		
	private static Treasure newTreasure(String str) {
		String title = str.split(" ")[0];
		int cost = Integer.parseInt(str.split(" ")[1]);
		
		return new Treasure(title, cost);
	}

}
