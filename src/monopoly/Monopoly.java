package monopoly;

public class Monopoly {
	
	private static GameBoard gameboard;
	
	private static void initialize() {
		gameboard = new GameBoard();
	}
	
	public static GameBoard getGameBoard() {
		return gameboard;
	}
	
	public static void main(String[] args) {
		initialize();		
		
		// TEST
		try
		{
		Test.test();
		} catch(Exception e) {
			System.out.println("FEHLER: " + e.getMessage());
		}
	}	

}
