package monopoly;


import java.util.ArrayList;

public class PropertyField extends Field implements ITransactionField{
	
	 Player owner;
	
	 public PropertyField(PropertyData propertyData) {
		super(propertyData);	
	}
	 public int getPrice ()
	 {
		 return this.property.getPrice();
	 }
	 public boolean isBuyable ()
	 {
		 if (this.getOwner() == null)
			 return true;
		 return false;
	 }
	 public Player getOwner ()
	 {
			return this.owner; 
	 }
	 public void setOwner (Player owner)
	 {
		 this.owner = owner;
	 }
	 public void onEnter ()
	 { 
		 
	 }
	 public PropertyGroup getGroup ()
	 {
		 return this.property.getPropertyGroup();
	 }
	 
	 /**
	  * Ist die Gruppe zu dem Feld komplett.
	  * @return
	 * @throws OwnerNotImplementedException 
	  */
	 public boolean groupComplete () 
	 {
		boolean isComplete = true;
		Player player = null;
		
		for (Field field : Monopoly.getGameBoard().getAllFields())
		{
			if (field.property.getPropertyGroup().equals(this.getGroup()))
			{
				PropertyField field2 = (PropertyField) field;
				
				if (field2.getOwner() != null)
				{
					if ((field2.getOwner() == player) 
					    || (player == null))
					{
						player = field2.getOwner();
					}
					else
					{
						isComplete = false;
						break;
					}
				}
				else
				{
					isComplete = false;
					break;
				}
			}			
		}
		
		return isComplete;
	 }
	@Override
	public void calculateTransaction() {
		
		
		
	}
	
	private ArrayList<Field> getPlayersGroupFields(Player player, PropertyGroup group)
	{
		ArrayList<Field> groupFieldList = new ArrayList<>();
		for (Field field : Monopoly.getGameBoard().getAllFields())
		{
			if (field.property.getPropertyGroup().equals(group))
			{
				PropertyField propField = (PropertyField)field;
				
				if ((player != null) 
				    && (propField.getOwner() == player))
				{
					groupFieldList.add(field);
				}
			}
		}
		
		return groupFieldList;
	}
	/**
	 * Ermittelt die Anzahl der Gruppen eines Spielers
	 * @param player (Der aktuelle Spieler, welches das Feld betritt)
	 * @param propGroup (Die gesuchte Gruppe) 
	 * @return Anzahl der Stra�en einer Farbe
	 */
	public int countPlayersGroupField (Player player, PropertyGroup group)
	{
		return getPlayersGroupFields(player, group).size();
	}
}
