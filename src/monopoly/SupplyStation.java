package monopoly;

public class SupplyStation extends PropertyField {

	public SupplyStation(PropertyData propertyData) {
		super(propertyData);

	}

	public void OnEnter() {
		// Check the Owner
		if (this.getOwner() == null) {
			// Street is buyable
		}
		// Fremder Spieler auf dem Feld
		else if (this.getOwner() != Monopoly.getGameBoard().getCurrentPlayer()) {
			try {
				Monopoly.getGameBoard().getCurrentPlayer()
						.removeMoney(CalculateRent());
			} catch (Exception e) {
				System.out.println("Player out of Money!");
			}
		} else {
			// Spieler auf seinem eigenem Feld
		}
	}

	private int CalculateRent() {
		if (this.groupComplete()) {
			return Monopoly.getGameBoard().getLastRoll() * 200;
		} else {
			return Monopoly.getGameBoard().getLastRoll() * 80;
		}
	}

}
