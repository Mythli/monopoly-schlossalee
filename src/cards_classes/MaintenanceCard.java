package cards_classes;

import monopoly.Monopoly;
import monopoly.Player;

public class MaintenanceCard extends Card {
	
	MaintenanceCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		int amountToPay = 0;
		
		Player currentPlayer = Monopoly.getGameBoard().getCurrentPlayer();
		for (monopoly.PropertyField field : currentPlayer.getOwnedFields()) {
			if (field.hasHotel())
				amountToPay += data.getAmountHotel();
			else
				amountToPay += field.getNumberHouses() * data.getAmountHouse();
		}
		
		currentPlayer.addMoney(amountToPay);
	}

}