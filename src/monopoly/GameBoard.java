package monopoly;

import java.util.ArrayList;
import java.util.HashMap;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	HashMap<String, Field> specialFields = new HashMap<String, Field>();
	private int currentPlayer;
	private Dice dice = new Dice();
	private Bank bank = new Bank();

	/***
	 * Erstellt eine Instanz der Klasse GameBoard
	 */
	public GameBoard(ArrayList<Field> fields,
			HashMap<String, Field> specialFields) {
		this.fields = fields;
		this.specialFields = specialFields;
	}

	/***
	 * Gibt die Instanz des W�rfels zur�ck
	 * 
	 * @return
	 */
	public Dice getDice() {
		return dice;
	}

	public Bank getBank() {
		return bank;
	}

	/***
	 * Gibt die Liste aller teilnehmenden Spieler zur�ck
	 * 
	 * @return
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/***
	 * Gibt die Liste alle Spielfelder zur�ck
	 * 
	 * @return
	 */
	public ArrayList<Field> getAllFields() {
		return fields;
	}

	/***
	 * F�gt den angegebenen Spieler dem Spielfeld hinzu
	 * 
	 * @param player
	 *            Der hinzuzuf�gende Spieler
	 */
	public void addPlayer(Player player) {
		if (!players.contains(player)) {
			players.add(player);
		}
	}

	/***
	 * Gibt den Spieler zur�ck, welcher aktuell an der Reihe ist
	 * 
	 * @return
	 */
	public Player getCurrentPlayer() {
		return players.get(currentPlayer);
	}

	/***
	 * Beendet den Spielzug des aktuellen Spielers
	 */
	public void endMove() {
		currentPlayer++;
		if (currentPlayer > players.size() - 1)
			currentPlayer = 0;
	}

	public Player getPlayerByName(String name) {
		for (Player p : players)
			if (p.getName().equals(name))
				return p;
		return null;
	}

	public int getNumberOfFields() {
		return fields.size();
	}

	public Field getFieldByName(String name) {
		return specialFields.get(name);
	}

	public Field getFieldById(int id) {
		return fields.get(id);
	}

	public Field getField(int position) {
		return fields.get(position);
	}

	public Field getField(String name) {
		return specialFields.get(name);
	}

	public ArrayList<Street> getStreetsByGroup(PropertyGroup group) {
		ArrayList<Street> streets = new ArrayList<Street>();

		for (Field field : this.getAllFields()) {
			Street street = (Street) (field);

			if (street.getGroup() == group) {
				streets.add(street);
			}
		}
		return streets;
	}

}
