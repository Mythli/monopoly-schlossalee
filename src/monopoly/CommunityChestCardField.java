package monopoly;

import cards_classes.CardStackField;

public class CommunityChestCardField extends CardStackField {

	CommunityChestCardField(monopoly.PropertyData propertyData) throws Exception {
		super(propertyData);
		this.cardCollection = Monopoly.getGameBoard().getCommunityChestCardStack();		
	}
	
	
}