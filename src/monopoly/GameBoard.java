package monopoly;

import java.util.ArrayList;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public ArrayList<Field> GetAllFields() {
		return fields;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public Player getCurrentPlayer() {
		return null;
	}

}
