package cards_classes;

public class CommunityChestCardField extends CardStack {

	private cards_classes.CardCollection cardCollection;	

	CommunityChestCardField(monopoly.PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = cards_classes.CardDataLoader.load("community_chest_cards.json");		
	}
	
}