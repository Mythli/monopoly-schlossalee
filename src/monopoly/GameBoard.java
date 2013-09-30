package monopoly;

import java.util.ArrayList;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public Player getCurrentPlayer() {
		return null;
	}

}
