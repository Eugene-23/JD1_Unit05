package htp.home.bouquet.bean;

public class HomeFlower extends Flower {

	private int roomsTemperature;
	
	public HomeFlower(String name, String colour, int cost, int roomsTemperature) {
		super(name, colour, cost);
		this.roomsTemperature = roomsTemperature;
	}

	public int getRoomsTemperature() {
		return roomsTemperature;
	}

	public void setRoomsTemperature(int roomsTemperature) {
		this.roomsTemperature = roomsTemperature;
	}
	
}
