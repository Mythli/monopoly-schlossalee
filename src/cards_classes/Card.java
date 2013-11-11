package cards_classes;

abstract public class Card {
	
	CardData data;
	
	Card(CardData data) {
		this.data = data;
	}
	
	abstract void execute();

}
