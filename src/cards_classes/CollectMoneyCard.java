package cards_classes;

import java.util.ArrayList;

public class CollectMoneyCard extends Card {
	
	CollectMoneyCard(CardData data) {
		super(data);
	}
	
	public void execute() throws Exception {
		//System.out.println("CollectMoneyCard");
		System.out.println(data.getText());
		monopoly.Player currentPlayer = monopoly.Monopoly.getGameBoard().getCurrentPlayer();
		ArrayList<monopoly.Player> players = monopoly.Monopoly.getGameBoard().getPlayers();
		
		
		for (monopoly.Player p : players)
		{	
			if (p != currentPlayer)
				p.transferMoneyToParticipant(currentPlayer, this.data.getAmount());
		}
	}

}
