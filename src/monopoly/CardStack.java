package monopoly;

import java.util.ArrayList;

public class CardStack extends EventField {	
	
	ArrayList<Card> cards;
	PropertyData propertyData;
	
	CardStack(PropertyData propertyData) {
		super(propertyData);
	}
	
	public void load(ArrayList<Card> cards) {
		this.cards = cards;		
	}
	
	public void takeAction(int cardIndex) {
		
	}
	
	public void selectRandomCard() {
		
	}

}
