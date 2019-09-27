package htp.home.bouquet.bean;

public class WildFlower extends Flower {

	private String growthCountry;
	
	public WildFlower(String name, String colour, int cost, String growthCountry) {
		super(name, colour, cost);
		this.growthCountry = growthCountry;
	}

	public String getGrowthCountry() {
		return growthCountry;
	}

	public void setGrowthCountry(String growthCountry) {
		this.growthCountry = growthCountry;
	}
	
}
