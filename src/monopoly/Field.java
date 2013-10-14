package monopoly;

public class Field {

	protected PropertyData property;
	
	public Field (PropertyData propertyData)
	{
		property = propertyData;
	}

	public void onEnter ()
	{
		System.out.println("onEnter");
	}

	public void calculateTransaction() {
		// TODO Auto-generated method stub
		
	}	
}
