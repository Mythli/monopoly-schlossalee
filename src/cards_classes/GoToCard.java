package cards_classes;

public class GoToCard extends Card {
	
	GoToCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GoToCard");
		System.out.println(data.getText());
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		currentPlayer.moveTo(this.data.getTo());
	}

}
