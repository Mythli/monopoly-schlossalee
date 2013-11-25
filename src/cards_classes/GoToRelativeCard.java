package cards_classes;

public class GoToRelativeCard extends Card {
	
	GoToRelativeCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GoToCard");
		System.out.println(data.getText());
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		currentPlayer.move(this.data.getSteps());
	}

}