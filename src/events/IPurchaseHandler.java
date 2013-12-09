package events;

public interface IPurchaseHandler {
	
	public void playerBoughtHouse(monopoly.Player player, monopoly.PropertyField field);
	
	public void playerBoughtHotel(monopoly.Player player, monopoly.PropertyField field);

}
