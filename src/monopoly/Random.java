package monopoly;

import java.security.SecureRandom;

public class Random {
	
	private SecureRandom generator;
	
	public Random() {
		generator = new SecureRandom();
	}
	
	public int getInt(int upperLimit) {
		return generator.nextInt(upperLimit + 1);		
	}

}
