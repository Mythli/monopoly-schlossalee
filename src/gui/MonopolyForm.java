
package gui;

import monopoly.*;



public class MonopolyForm implements events.IDiceHandler, events.IPlayerMovementHandler, events.IAccountHandler, events.IPurchaseHandler{
	
	public MonopolyForm ()
	{		
	}
	Monopoly monopoly = new Monopoly ();

	@Override
	public void diceRolled(int dice) {
		System.out.println("Es wurde gewürfelt " + dice);
	}

	@Override
	public void playerMoved(Player player, Field field) {
		System.out.println("Spieler " + player.getName() + " muss auf das Feld " + field.property.getName());
	}
	
	public void addPlayers ()
	{
		monopoly.getGameBoard().addPlayer(new Player("Fredde"));
		monopoly.getGameBoard().addPlayer(new Player("Stefan"));
		monopoly.getGameBoard().addPlayer(new Player("Jan"));
	}
	
	public void start() throws Exception
	{
		addPlayers();
		for(int zaehler = 1; zaehler < 20; zaehler++ )
		{
			monopoly.getGameBoard().makeMove();			
			System.out.println("Spieler steht aktuell auf Feld " + monopoly.getGameBoard().getCurrentPlayer().getCurrentField().property.getName());
			if (monopoly.getGameBoard().getCurrentPlayer().getCurrentField().isBuyable())
				monopoly.getGameBoard().getCurrentPlayer().buyField();
		}
		
	}

	@Override
	public void balanceChanged(Player player) {
		//Kontostand hat sich geändert
		
		System.out.println("Der Kontostand für Spieler "+ player.getName() + "hat sich geändernt");
		System.out.println("Der Kontostand hat sich auf " + player.getCurrentMoney() + " geändert!");
		
	}

	@Override
	public void playerBoughtHouse(Player player, PropertyField field) {
		System.out.println("Der Spieler "+ player.getName()+ " hat ein House gekauft");
		
	}

	@Override
	public void playerBoughtHotel(Player player, PropertyField field) {
		System.out.println("Der Spieler "+ player.getName()+ " hat ein Hotel gekauft");
		//monopoly.getGameBoard().getCurrentPlayer().buyHotel();
		
	}
	
	
	
	
	

}
