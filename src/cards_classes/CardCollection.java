package cards_classes;

import java.util.ArrayList;

public class CardCollection {
	
	public ArrayList<Card> cards;
	private monopoly.Random randomNumberGenerator;
	
	public CardCollection(ArrayList<Card> cards) {
		this.cards = cards;
		this.randomNumberGenerator = new monopoly.Random();
	}
	
	public void drawCard() throws Exception {
		int index = randomNumberGenerator.getInt(this.cards.size() - 1);
		cards.get(index).execute();
	}

}
