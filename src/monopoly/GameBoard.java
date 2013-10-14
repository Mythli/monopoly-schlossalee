package monopoly;

import java.util.ArrayList;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	private int currentPlayer;

	/***
	 * Gibt die Liste aller teilnehmenden Spieler zurück
	 * @return
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/***
	 * Gibt die Liste alle Spielfelder zurück
	 * @return
	 */
	public ArrayList<Field> GetAllFields() {
		return fields;
	}

	/***
	 * Fügt den angegebenen Spieler dem Spielfeld hinzu
	 * @param player
	 */
	public void addPlayer(Player player) {
		if (!players.contains(player)) {
			players.add(player);
		}
	}

	/***
	 * Gibt den Spieler zurück, welcher aktuell an der Reihe ist
	 * @return
	 */
	public Player getCurrentPlayer() {
		return players.get(currentPlayer);
	}
	
	/***
	 * Beendet den Spielzug des aktuellen Spielers
	 */
	public void endMove(){
		currentPlayer++;
		if(currentPlayer > players.size() - 1)
			currentPlayer = 0;
	}
	
	public static void main(String[] args) throws Exception {
		GameBoard gameBoard = new GameBoard();
		gameBoard.fields = DataLoader.loadFields();
	}

}
