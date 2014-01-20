package monopoly;

import gui.MonopolyForm;


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
		
		//Test.test();
		
		MonopolyForm form = new MonopolyForm ();
		form.start();
	}	

}
