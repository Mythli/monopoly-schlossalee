package monopoly;

public class Test {

	static void test() throws Exception {
		Monopoly.getGameBoard().addPlayer(new Player("TRO"));
		Monopoly.getGameBoard().addPlayer(new Player("CKL"));
		System.out.println("Roll: " + Monopoly.getGameBoard().getDice().roll());
		System.out.println("isPair: "
				+ Monopoly.getGameBoard().getDice().isPair());

		System.out.println("Spieler: ");
		for (Player p : Monopoly.getGameBoard().getPlayers())
			System.out.println(p.getName() + " - " + p.getCurrentMoney() + " €");

		Monopoly.getGameBoard().getCurrentPlayer().transferMoneyToParticipant(Monopoly.getGameBoard().getPlayerByName("CKL"), 1500);
		
		System.out.println("--------");
		
		System.out.println("Spieler: ");
		for (Player p : Monopoly.getGameBoard().getPlayers())
			System.out.println(p.getName() + " - " + p.getCurrentMoney() + "$");
		
		
		for (Field f : Monopoly.getGameBoard().getAllFields())
			System.out.println(f.property.getName() + ", "
					+ f.property.getPosition() + ", " + f.property.getPrice()
					+ ", " + f.property.getPropertyGroup() + ", "
					+ f.property.getRentPrices());
<<<<<<< HEAD
	
		
		
		Player ckl = Monopoly.getGameBoard().getPlayerByName("CKL");
		System.out.println("Position CKL (vorher): " + ckl.getCurrentField().property.getPosition());
		
		ckl.move(Monopoly.getGameBoard().getAllFields().get(0));
		ckl.move(Monopoly.getGameBoard().getDice().getLastRoll());
		
		System.out.println("Position CKL (nachher - Methode 1): " + ckl.getPosition());
		System.out.println("Position CKL (nachher - Methode 2): " + ckl.getCurrentField().property.getPosition());
		
		System.out.println("----");
		
		ckl.move(Monopoly.getGameBoard().getAllFields().get(39));
		ckl.move(5);
		
		ckl.getCurrentField().onEnter();
		//if (ckl.getCurrentField().property.getTransactionAmount() ) {}
		
		
		
		
		
=======
>>>>>>> a12f712ea0400f9eb4671f6f8673b531a1ba0035
	}

}
