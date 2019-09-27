package htp.home.treasures.main;

import java.util.List;

import htp.home.treasures.bean.Treasure;
import htp.home.treasures.service.ServiceException;
import htp.home.treasures.service.ServiceProvider;

/*
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */

public class Main {

	public static void main(String[] args) {
		
		//get all
		try {
			print(ServiceProvider.getInstance().getTreasureServiceImpl().takeTreasure());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		//max cost treasures
		try {
			print(ServiceProvider.getInstance().getTreasureServiceImpl().findMaxCostTreasures());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		//find treasures by cost
		try {
			print(ServiceProvider.getInstance().getTreasureServiceImpl().findTreasuresByCost(1600));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void print(List<Treasure> treasures) {
		for (Treasure tr : treasures) {
			System.out.println(tr.toString());
		}
	}

}
