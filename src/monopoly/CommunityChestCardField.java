package monopoly;

public class CommunityChestCardField extends CardStack {

	private cards_classes.CardCollection cardCollection;	

	CommunityChestCardField(PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = cards_classes.CardDataLoader.load("community_chest_cards.json");		
	}
	
}