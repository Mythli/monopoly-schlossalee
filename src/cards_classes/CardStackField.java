package cards_classes;

import java.util.ArrayList;


public class CardStackField extends monopoly.EventField {	
	
	ArrayList<Card> cards;
	monopoly.PropertyData propertyData;
	CardCollection cardCollection;
	
	public CardStackField(monopoly.PropertyData propertyData) {
		super(propertyData);
	}
	
	public void load(ArrayList<Card> cards) {
		this.cards = cards;		
	}
	
	public void onEnter() throws Exception {
		cardCollection.drawCard();
	}

}
