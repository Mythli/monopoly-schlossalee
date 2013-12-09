package cards_classes;

public class CardData {

	private String text;
	private int amount;
	private String to;
	private int amountHotel;
	private int amountHouse;
	private int steps;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

	public int getAmountHotel() {
		return amountHotel;
	}

	public void setAmountHotel(int amount_hotel) {
		this.amountHotel = amount_hotel;
	}

	public int getAmountHouse() {
		return amountHouse;
	}

	public void setAmountHouse(int amount_house) {
		this.amountHouse = amount_house;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	

}