package monopoly;

public class TrainStation extends PropertyField {

	private int[] rentPrices = new int[] { 500, 1000, 2000, 4000 };

	public TrainStation(PropertyData propertyData) {
		super(propertyData);
		// TODO Auto-generated constructor stub
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
		int sumTrainstation = this.countPlayersGroupField(this.getOwner(),
				PropertyGroup.BAHNHOF);
		int price = 0;

		if (sumTrainstation > 0) {
			price = rentPrices[sumTrainstation - 1];
		}

		return price;
	}
}
