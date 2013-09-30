package monopoly;

public class Street extends PropertyField {
	
	public Street(PropertyData propertyData) {
		super(propertyData);
		// TODO Auto-generated constructor stub
	}

	public int getHouseCount ()
	{
		return 0;
	}
	
	public void OnEnter()
	{
		// Check the Owner
		if (this.getOwner() == null)
		{
			//Street is buyable
		}
		else if (this.getOwner() != Monopoly.getGameBoard().getCurrentPlayer())
		{
			
		}
		else
		{
			//Person have to pay
		}
	}
	
	

}
