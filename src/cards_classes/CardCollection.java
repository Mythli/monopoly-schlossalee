package cards_classes;

import java.util.ArrayList;

public class CardCollection {
	
	private ArrayList<Card> cards;
	private monopoly.Random randomNumberGenerator;
	
	CardCollection(ArrayList<Card> cards) {
		this.cards = cards;
		this.randomNumberGenerator = new monopoly.Random();
	}
	
	public void drawCard() {
		int index = randomNumberGenerator.getInt(this.cards.size() - 1);
		cards.get(index).execute();
	}

}
