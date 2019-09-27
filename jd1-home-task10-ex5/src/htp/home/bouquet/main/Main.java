package htp.home.bouquet.main;

import java.util.ArrayList;
import java.util.List;

import htp.home.bouquet.bean.Bouquet;
import htp.home.bouquet.bean.Flower;
import htp.home.bouquet.bean.Packaging;
import htp.home.bouquet.service.ServiceException;
import htp.home.bouquet.service.ServiceProvider;

/*
 * Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции 
 * (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 */

public class Main {

	public static void main(String[] args) {
				
		Bouquet bouquet;
		List<Flower> flowers = new ArrayList<Flower>();
		Packaging pack;
		
		try {			
			flowers.add(ServiceProvider.getInstance().getFlowerService().addHomeFlower());
			flowers.add(ServiceProvider.getInstance().getFlowerService().addWildFlower());
			
			pack = ServiceProvider.getInstance().getFlowerService().addPackaging();
			
			bouquet = new Bouquet(flowers, pack);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
