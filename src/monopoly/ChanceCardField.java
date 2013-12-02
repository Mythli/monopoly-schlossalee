package monopoly;

public class ChanceCardField extends cards_classes.CardStackField {
	
	private cards_classes.CardCollection cardCollection;	

	ChanceCardField(PropertyData propertyData) throws Exception {
		super(propertyData);
		cardCollection = Monopoly.getGameBoard().getChanceCardStack();		
	}
	
	public void onEnter() throws Exception {
		cardCollection.drawCard();
	}
	
}
 