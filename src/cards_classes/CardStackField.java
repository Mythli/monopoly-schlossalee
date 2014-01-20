package cards_classes;

import java.util.ArrayList;


public class CardStackField extends monopoly.EventField {	
	
	public ArrayList<Card> cards;
	public monopoly.PropertyData propertyData;
	public CardCollection cardCollection;
	
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
