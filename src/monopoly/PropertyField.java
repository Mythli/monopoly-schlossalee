package monopoly;

import java.util.ArrayList;

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
		 //getPlayersGroupFields(this.getOwner(), PropertyGroup.DUNKELBLAU);
		 return null;
	 }
	 
	 /**
	  * Ist die Gruppe zu dem Feld komplett.
	  * @return
	  */
	 public boolean groupComplete ()
	 {
		boolean isComplete = true;
		Player player = null;
		
		for (Field field : Monopoly.getGameBoard().GetAllFields())
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
		// TODO Auto-generated method stub
		
	}
	
	private ArrayList<Field> getPlayersGroupFields(Player player, PropertyGroup group)
	{
		ArrayList<Field> groupFieldList = new ArrayList<>();
		for (Field field : Monopoly.getGameBoard().GetAllFields())
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
	 * @return Anzahl der Straﬂen einer Farbe
	 */
	public int countPlayersGroupField (Player player, PropertyGroup group)
	{
		return getPlayersGroupFields(player, group).size();
	}
}
