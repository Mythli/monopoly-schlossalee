package monopoly;

import cards_classes.CardCollection;
import cards_classes.CardDataLoader;
import cards_classes.CardStack;

public class CommunityChestCardField extends CardStack {

	private cards_classes.CardCollection cardCollection;	

	CommunityChestCardField(monopoly.PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = cards_classes.CardDataLoader.load("community_chest_cards.json");		
	}
	
	public void onEnter() throws Exception {
		cardCollection.drawCard();
	}
	
}