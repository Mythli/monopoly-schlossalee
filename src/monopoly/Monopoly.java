package monopoly;

public class Monopoly {
	
	private static GameBoard gameboard;
	
	private static void initialize() throws Exception {
		gameboard = DataLoader.load();
	}
	
	public static GameBoard getGameBoard() {
		return gameboard;
	}
	
	public static void main(String[] args) throws Exception {
		initialize(); 
		
		Test.test();
		
		/*
		for (Object o : gameboard.getAllFields())
			System.out.println(o);
		*/
		
		//cards_classes.CardDataLoader.load("community_chest_cards.json");
		cards_classes.CardCollection c = cards_classes.CardDataLoader.load("chance_cards.json");

		for (cards_classes.Card o : c.cards)
		{
			System.out.println(o.getClass());
			
		
		}
	}	

}
