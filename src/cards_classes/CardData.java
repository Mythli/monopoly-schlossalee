package cards_classes;

public class CardData {

	private String text;
	private int amount;
	private String to;
	private int amount_hotel;
	private int amount_house;
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

	public int getAmount_hotel() {
		return amount_hotel;
	}

	public void setAmount_hotel(int amount_hotel) {
		this.amount_hotel = amount_hotel;
	}

	public int getAmount_house() {
		return amount_house;
	}

	public void setAmount_house(int amount_house) {
		this.amount_house = amount_house;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	

}