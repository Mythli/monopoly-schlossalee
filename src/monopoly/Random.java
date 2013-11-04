package monopoly;

import java.security.SecureRandom;

public class Random {
	
	private SecureRandom generator;
	
	Random() {
		generator = new SecureRandom();
	}
	
	public int getInt(int upperLimit) {
		return generator.nextInt(upperLimit + 1);		
	}

}
