package cards_classes;

import java.util.ArrayList;


public class CardStack extends monopoly.EventField {	
	
	ArrayList<Card> cards;
	monopoly.PropertyData propertyData;
	
	public CardStack(monopoly.PropertyData propertyData) {
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
