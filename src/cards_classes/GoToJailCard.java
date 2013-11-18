package cards_classes;

public class GoToJailCard extends Card {
	
	GoToJailCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GoToCard");
		System.out.println(data.getText());
		
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		
		//currentPlayer.goToJail();
	}

}