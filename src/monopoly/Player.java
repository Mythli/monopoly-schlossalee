package monopoly;

public class Player extends Participant {

	public String name;
	private int currentMoney;

	public Player(String name) {
		this.name = name;
		// TODO: Startgelder aus einer Config lesen!
		this.currentMoney = 15000;
	}

	/***
	 * Gibt das aktuelle Guthaben des Spielers zurück
	 */
	public int getCurrentMoney() {
		return currentMoney;
	}

	/***
	 * Transferiert eine bestimmte Menge Geld an einen anderen Teilnehmer
	 */
	public void transferMoneyToParticipant(Participant player, int amount) throws Exception {
		if(currentMoney >= amount){
			player.addMoney(amount);
			currentMoney -= amount;
		}else{
			// TODO: Eigene Exceptions (z.B. OutOfMoneyException)
			throw new Exception("Nicht genügend Geld für die Transaktion vorhanden!");
		}
	}

	/***
	 * Fügt eine bestimmte Menge Geld zum Guthaben des Spielers hinzu
	 */
	public void addMoney(int amount) {
		currentMoney += amount;
	}
	
	/***
	 * Zieht eine bestimmte Menge Geld vom Guthaben des Spielers ab
	 */
	public void removeMoney(int amount) throws Exception{
		if(amount > 0){
			addMoney(amount);	
		}else{
			// TODO: Eigene Exceptions
			throw new Exception("Man kann keinen negativen Betrag abziehen!");
		}
	}

	/***
	 * Gibt das aktuelle Field-Objekt, auf welchem sich der Spieler befindet zurück
	 * @return
	 */
	public Field getCurrentField() {
		return null;
	}

	
	public void move(Field field) {

	}

	public void move(int value) {
			
	}
}
