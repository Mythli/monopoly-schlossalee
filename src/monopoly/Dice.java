package monopoly;

import java.util.Random;

public class Dice {
	private Random rnd = new Random();
	private boolean isPair;
	private int lastRoll;

	/***
	 * Gibt an, ob es sich bei dem letzen Wurf um einen Pasch handelt
	 * @return
	 */
	public boolean isPair() {
		return isPair;
	}

	/***
	 * Rollt das Würfelpaar
	 * @return
	 */
	public int roll() {
		isPair = false;

		int dice1 = rnd.nextInt(5) + 1;
		int dice2 = rnd.nextInt(5) + 1;

		if (dice1 == dice2)
			isPair = true;
		
		lastRoll = dice1 + dice2;
		return lastRoll;
	}
	
	/***
	 * Gibt den Wert des letzten Wurfs zurück
	 * @return
	 */
	public int getLastRoll() {
		return lastRoll; 
	}
}
