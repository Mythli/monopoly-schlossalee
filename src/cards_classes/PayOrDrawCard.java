package cards_classes;

import monopoly.Monopoly;

public class PayOrDrawCard extends Card {
	
	PayOrDrawCard(CardData data) {
		super(data);
	}
	
	// TODO
	private boolean CHOOSE_DRAW()
	{
		return false;
	}
	
	public void execute() throws Exception {
		
		if (CHOOSE_DRAW())
			Monopoly.getGameBoard().getChanceCardStack().drawCard();
		else
			Monopoly.getGameBoard().getCurrentPlayer().removeMoney(200);

	}

}
