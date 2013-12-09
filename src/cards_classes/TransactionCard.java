package cards_classes;

public class TransactionCard extends Card {
	
	TransactionCard(CardData data) {
		super(data);
	}
	
	public void execute() throws Exception {
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		currentPlayer.addMoney(this.data.getAmount());
	}

}
