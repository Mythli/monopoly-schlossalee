package monopoly;

public class Street extends PropertyField {
	
	private int houseCounter = 0;
	
	public Street(PropertyData propertyData) {
		super(propertyData);
		// TODO Auto-generated constructor stub
	}

	public int getHouseCount ()
	{
		return houseCounter;
	}
	public void addHouse ()
	{
		if (Monopoly.getGameBoard().getCurrentPlayer() == this.getOwner())
		{
			if (houseCounter <6)
			{
				houseCounter++;
				
				try {
					Monopoly.getGameBoard().getCurrentPlayer().removeMoney(this.property.getHousePrice());
				} catch (Exception e) {
					System.out.println("Player out of Money!");
				}
			}
		}
	}
	
	public void OnEnter()
	{
		// Check the Owner
		if (this.getOwner() == null)
		{
			//Street is buyable
		}
		// Fremder Spieler auf dem Feld
		else if (this.getOwner() != Monopoly.getGameBoard().getCurrentPlayer())
		{
			try {
				Monopoly.getGameBoard().getCurrentPlayer().removeMoney(CalculateRent());
			} catch (Exception e) {
				System.out.println("Player out of Money!");
			}
		}
		else
		{
			//Spieler auf seinem eigenem Feld
		}
	}
	private int CalculateRent ()
	{
		return this.property.getRentPrices().get(houseCounter);
	}
	
	

}
