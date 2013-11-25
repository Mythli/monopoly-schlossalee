package monopoly;

import java.util.ArrayList;
import java.util.HashMap;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	HashMap<String, Field> specialFields = new HashMap<String, Field>();
	private int currentPlayer;
	private Dice dice = new Dice();;

	/***
	 * Erstellt eine Instanz der Klasse GameBoard
	 */
	public GameBoard(ArrayList<Field> fields, HashMap<String, Field> specialFields) {
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
	
	public Field getFieldByName(String name) {
		return specialFields.get(name);
	}
}
