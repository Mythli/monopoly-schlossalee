package monopoly;

import java.util.Random;

public class Dice {
	private Random rnd = new Random();
	private boolean isPair;

	public boolean isPair() {
		return isPair;
	}

	public int roll() {
		isPair = false;

		int dice1 = rnd.nextInt(5) + 1;
		int dice2 = rnd.nextInt(5) + 1;

		if (dice1 == dice2)
			isPair = true;

		return dice1 + dice2;
	}
}
