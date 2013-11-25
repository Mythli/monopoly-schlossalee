package cards_classes;

public class ChanceCardField extends CardStack {
	
	private cards_classes.CardCollection cardCollection;	

	ChanceCardField(monopoly.PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = cards_classes.CardDataLoader.load("chance_cards.json");		
	}
	
}
