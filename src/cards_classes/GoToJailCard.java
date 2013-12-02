package cards_classes;

public class GoToJailCard extends Card {
	
	GoToJailCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		currentPlayer.goToJail();
	}

}