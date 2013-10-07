package monopoly;

import java.util.ArrayList;

public class PropertyData {

	private String name;
	private int position;
	private int price;
	private PropertyGroup propertyGroup;
	private int hypothek;
	private ArrayList<Integer> rentPrices;
	private int housePrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public PropertyGroup getPropertyGroup() {
		return propertyGroup;
	}

	public void setPropertyGroup(PropertyGroup propertyGroup) {
		this.propertyGroup = propertyGroup;
	}

	public int getHypothek() {
		return hypothek;
	}

	public void setHypothek(int hypothek) {
		this.hypothek = hypothek;
	}

	public ArrayList<Integer> getRentPrices() {
		return rentPrices;
	}

	public void setRentPrices(ArrayList<Integer> rentPrices) {
		this.rentPrices = rentPrices;
	}
	
	public int getHousePrice() {
		return housePrice;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

}