package monopoly;

public class CommunityChestCardField extends CardStack {

	private CardCollection cardCollection;	

	CommunityChestCardField(PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = CardDataLoader.load("community_chest_cards.json");		
	}
	
}