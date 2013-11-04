package monopoly;

public class ChanceCardField extends CardStack {
	
	private CardCollection cardCollection;	

	ChanceCardField(PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = CardDataLoader.load("chance_cards.json");		
	}
	
}
