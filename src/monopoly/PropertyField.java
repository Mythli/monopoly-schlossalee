package monopoly;

public class PropertyField extends Field implements ITransactionField{
	
	
	
	 public PropertyField(PropertyData propertyData) {
		super(propertyData);	
	}
	 public double getPrice ()
	 {
		 return 0.0;
	 }
	 protected Player getOwner ()
	 {
		 return null;
	 }
	 public void onEnter ()
	 {
		 
	 }
	 public PropertyGroup getGroup ()
	 {
		 return null;
	 }
	 public boolean groupComplete ()
	 {
		 return true;
	 }
	@Override
	public void calculateTransaction() {
		// TODO Auto-generated method stub
		
	}

}
