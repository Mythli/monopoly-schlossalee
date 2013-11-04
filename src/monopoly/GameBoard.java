package monopoly;

import java.util.ArrayList;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	private int currentPlayer;
	private Dice dice;

	/***
	 * Erstellt eine Instanz der Klasse GameBoard
	 */
	public GameBoard(ArrayList<Field> fields) {
		this.fields = fields;
		dice = new Dice();
	}

	/***
	 * Gibt die Instanz des Würfels zurück
	 * 
	 * @return
	 */
	public Dice getDice() {
		return dice;
	}

	/***
	 * Gibt die Liste aller teilnehmenden Spieler zurück
	 * 
	 * @return
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/***
	 * Gibt die Liste alle Spielfelder zurück
	 * 
	 * @return
	 */
	public ArrayList<Field> getAllFields() {
		return fields;
	}

	/***
	 * Fügt den angegebenen Spieler dem Spielfeld hinzu
	 * 
	 * @param player
	 *            Der hinzuzufügende Spieler
	 */
	public void addPlayer(Player player) {
		if (!players.contains(player)) {
			players.add(player);
		}
	}

	/***
	 * Gibt den Spieler zurück, welcher aktuell an der Reihe ist
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

}
