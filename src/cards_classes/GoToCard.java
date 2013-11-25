package cards_classes;

public class GoToCard extends Card {
	
	GoToCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GoToCard");
		System.out.println(data.getText());
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		
		monopoly.Field goToField = monopoly.Monopoly.getGameBoard().getFieldByName(this.data.getTo());
		
		currentPlayer.move(goToField);
	}

}
