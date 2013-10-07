package monopoly;

public class Player extends Participant {

	private String name;
	private int currentMoney;
	private int position;

	public Player(String name) {
		setName(name);
		// TODO: Startgelder aus einer Config lesen!
		this.currentMoney = 15000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * Gibt das aktuelle Guthaben des Spielers zurück
	 */
	public int getCurrentMoney() {
		return currentMoney;
	}

	/***
	 * Transferiert eine bestimmte Menge Geld an einen anderen Teilnehmer
	 * @param player Der Spieler welcher Geld bekommen soll
	 * @param amount Die Menge Geld, welche der Spieler bekommt
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
	 * @param amount Die Menge Geld, welche hinzugefügt wird
	 */
	public void addMoney(int amount) {
		currentMoney += amount;
	}
	
	/***
	 * Zieht eine bestimmte Menge Geld vom Guthaben des Spielers ab
	 * @param amount Die Menge Geld, welche abgezogen wird
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
		return Monopoly.getGameBoard().getAllFields().get(this.position);
	}
	
	public void move(Field field) {
		this.position = field.property.getPosition();
	}

	public void move(int value) {
		this.position += value;
		int diff = Monopoly.getGameBoard().getAllFields().size() - this.position;
		
		if(diff > 0)
			this.position += diff;
		
	}
}
