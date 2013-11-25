package monopoly;

public class Player extends Participant {

	private String name;
	private int currentMoney;
	private int position;
	private boolean isInJail = false;

	/***
	 * Erstellt eine Instanz der Klasse Player mit dem angegebenen Namen
	 * 
	 * @param name
	 */
	public Player(String name) {
		setName(name);
		// TODO: Startgelder aus einer Config lesen!
		this.currentMoney = 15000;
	}

	/***
	 * Gibt den Namen des Spielers zur�ck
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/***
	 * Benennt den Spieler mit dem angegebenen Namen um
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/***
	 * Gibt das aktuelle Guthaben des Spielers zur�ck
	 */
	public int getCurrentMoney() {
		return currentMoney;
	}

	/***
	 * Transferiert eine bestimmte Menge Geld an einen anderen Teilnehmer
	 * 
	 * @param player
	 *            Der Spieler welcher Geld bekommen soll
	 * @param amount
	 *            Die Menge Geld, welche der Spieler bekommt
	 */
	public void transferMoneyToParticipant(Participant player, int amount)
			throws Exception {
		if (currentMoney >= amount) {
			player.addMoney(amount);
			currentMoney -= amount;
		} else {
			// TODO: Eigene Exceptions (z.B. OutOfMoneyException)
			throw new Exception(
					"Nicht gen�gend Geld f�r die Transaktion vorhanden!");
		}
	}

	/***
	 * F�gt eine bestimmte Menge Geld zum Guthaben des Spielers hinzu
	 * 
	 * @param amount
	 *            Die Menge Geld, welche hinzugef�gt wird
	 */
	public void addMoney(int amount) {
		currentMoney += amount;
	}

	/***
	 * Zieht eine bestimmte Menge Geld vom Guthaben des Spielers ab
	 * 
	 * @param amount
	 *            Die Menge Geld, welche abgezogen wird
	 */
	public void removeMoney(int amount) throws Exception {
		if (amount > 0) {
			addMoney(amount);
		} else {
			// TODO: Eigene Exceptions
			throw new Exception("Man kann keinen negativen Betrag abziehen!");
		}
	}

	/***
	 * Gibt das aktuelle Field-Objekt, auf welchem sich der Spieler befindet
	 * zur�ck
	 * 
	 * @return
	 */
	public Field getCurrentField() {
		return Monopoly.getGameBoard().getAllFields().get(this.position);
	}

	/***
	 * Bewegt den aktuellen Spieler auf ein bestimmtes Feld
	 * 
	 * @param field
	 */
	public void move(Field field) {
		this.position = field.property.getPosition();
		field.onEnter();
	}

	/***
	 * Bewegt den aktuellen Spieler um den angegebenen Wert weiter
	 * 
	 * @param value
	 */
	public void move(int value) {
		int position = this.position + value % Monopoly.getGameBoard().getNumberOfFields();
		this.move(Monopoly.getGameBoard().getField(position));
	}
	
	public void moveTo(String name) {
		this.move(Monopoly.getGameBoard().getField(name));
	}
	
	public int getPosition(){
		return this.position;
	}
	
	public void goToJail() {
		this.isInJail = true;
	}
	
	public void getOutOfJail() {
		this.isInJail = false;
	}
	
	public boolean isInJail() {
		return this.isInJail;
	}
	
}
