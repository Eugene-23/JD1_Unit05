package htp.home.bouquet.dao.impl;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import htp.home.bouquet.bean.HomeFlower;
import htp.home.bouquet.bean.WildFlower;
import htp.home.bouquet.dao.DAOException;
import htp.home.bouquet.dao.FlowerDAO;

public class FileFlowerDAO implements FlowerDAO {

	private static final String SOURCE1 = "resources/wildflowers.txt";
	private static final String SOURCE2 = "resources/homeflowers.txt";
	
	@Override
	public WildFlower takeWildFlower() throws DAOException {
		
		WildFlower wildFlower = null;
		FileReader fr;
		
		try {
			fr = new FileReader(SOURCE1);
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(fr);
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				wildFlower = newWildFlower(str);
			}
			
			fr.close();
			
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return wildFlower;
	}

	private static WildFlower newWildFlower(String str) {
		String name = str.split(" ")[0];
		String colour = str.split(" ")[1];
		int cost = Integer.parseInt(str.split(" ")[2]);
		String growthCountry = str.split(" ")[3];
		return new WildFlower(name, colour, cost, growthCountry);
	}

	@Override
	public HomeFlower takeHomeFlower() throws DAOException {
		HomeFlower homeFlower = null;
		FileReader fr;
		
		try {
			fr = new FileReader(SOURCE2);
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(fr);
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				homeFlower = newHomeFlower(str);
			}
			
			fr.close();
			
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return homeFlower;
	}

	private static HomeFlower newHomeFlower(String str) {
		String name = str.split(" ")[0];
		String colour = str.split(" ")[1];
		int cost = Integer.parseInt(str.split(" ")[2]);
		int roomsTemperature = Integer.parseInt(str.split(" ")[3]);
		return new HomeFlower(name, colour, cost, roomsTemperature);
	}
	
}
