package monopoly;

public class Player extends Participant {

	public String name;
	private int currentMoney;

	public Player(String name) {
		this.name = name;
		// TODO: Startgelder aus einer Config lesen!
		this.currentMoney = 15000;
	}

	public int getCurrentMoney() {
		return currentMoney;
	}

	public void giveMoneyToParticipant(Participant player, int amount) throws Exception {
		if(currentMoney >= amount){
			player.addMoney(amount);
			currentMoney -= amount;
		}else{
			// TODO: Eigene Exceptions (z.B. OutOfMoneyException)
			throw new Exception("Nicht genügend Geld für die Transaktion vorhanden!");
		}
	}

	public void addMoney(int value) {
		currentMoney += value;
	}
	
	public void removeMoney(int value) throws Exception{
		if(value < 0){
			addMoney(value);	
		}else{
			throw new Exception("Man kann keinen negativen Betrag abziehen!");
		}
		
	}

	public Field getCurrentField() {
		return null;
	}

	public void move(Field field) {

	}

	public void move(int value) {
			
	}
}
