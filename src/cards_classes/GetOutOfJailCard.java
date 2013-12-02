package cards_classes;

import monopoly.Monopoly;
import monopoly.Player;

public class GetOutOfJailCard extends Card {
	
	GetOutOfJailCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		Player currentPlayer = Monopoly.getGameBoard().getCurrentPlayer();
		currentPlayer.addGetOutOfJailCard();
	}

}
