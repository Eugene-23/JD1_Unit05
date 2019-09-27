package htp.home.bouquet.dao.impl;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import htp.home.bouquet.bean.Packaging;
import htp.home.bouquet.dao.DAOException;
import htp.home.bouquet.dao.PackgingDAO;

public class FilePackgingDAO implements PackgingDAO {

	private static final String SOURCE = "resources/packging.txt";
	
	@Override
	public Packaging takePackaging() throws DAOException {
		
		Packaging pack = null;
		FileReader fr;
		
		try {
			fr = new FileReader(SOURCE);
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(fr);
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				pack = newPackaging(str);
			}
			
			fr.close();
			
		} catch (IOException e) {
			throw new DAOException(e);
		}
		return pack;
	}

	private static Packaging newPackaging(String str) {
		String name = str.split(" ")[0];
		String type = str.split(" ")[1];
		int cost = Integer.parseInt(str.split(" ")[2]);
		return new Packaging(name, type, cost);
	}

}
