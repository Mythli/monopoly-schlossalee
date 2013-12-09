package monopoly;

import cards_classes.CardCollection;
import cards_classes.CardDataLoader;
import cards_classes.CardStackField;

public class CommunityChestCardField extends CardStackField {

	private cards_classes.CardCollection cardCollection;	

	CommunityChestCardField(monopoly.PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = Monopoly.getGameBoard().getCommunityChestCardStack();		
	}
	
	
}