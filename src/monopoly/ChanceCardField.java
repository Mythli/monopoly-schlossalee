package monopoly;

public class ChanceCardField extends cards_classes.CardStack {
	
	private cards_classes.CardCollection cardCollection;	

	ChanceCardField(PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = cards_classes.CardDataLoader.load("chance_cards.json");		
	}
	
	public void onEnter() throws Exception {
		cardCollection.drawCard();
	}
	
}
 