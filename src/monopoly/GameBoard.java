package monopoly;

import java.util.ArrayList;
import java.util.HashMap;

public class GameBoard {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Field> fields = new ArrayList<Field>();
	HashMap<String, Field> specialFields = new HashMap<String, Field>();
	private int currentPlayer = 0;
	private Dice dice = new Dice();
	private Bank bank = new Bank();
	private cards_classes.CardCollection chanceCardStack;
	private cards_classes.CardCollection communityChestCardStack;
	
	private events.IAccountHandler accountHandler;
	private events.IDiceHandler diceHandler;
	private events.IMessageHandler messageHandler;
	private events.IPlayerMovementHandler playerMovementHandler;
	private events.IPurchaseHandler purchaseHandler;

	/***
	 * Erstellt eine Instanz der Klasse GameBoard
	 */
	public GameBoard(ArrayList<Field> fields, HashMap<String, Field> specialFields) throws Exception {
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
	public void makeMove() throws Exception {
		if (players.size() == 0)
			throw new RuntimeException("Bitte Spieler hinzufügen");
		getCurrentPlayer().makeMove();
		currentPlayer = (currentPlayer + 1) % players.size();
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

	public cards_classes.CardCollection getCommunityChestCardStack() {
		return communityChestCardStack;
	}
	
	public cards_classes.CardCollection getChanceCardStack() {
		return chanceCardStack;
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
	
	// Event-Handler
	
	public void setAccountHandler(events.IAccountHandler accountHandler) {
		this.accountHandler = accountHandler;
	}

	public void balanceChanged(Player player) {
		if (accountHandler != null)
			accountHandler.balanceChanged(player);
	}
	
	public void setDiceHandler(events.IDiceHandler diceHandler) {
		this.diceHandler = diceHandler;
	}

	public void diceRolled(int number) {
		if (diceHandler != null)
			diceHandler.diceRolled(number);
	}
	
	public void setMessageHandler(events.IMessageHandler messageHandler) {
		this.messageHandler = messageHandler;
	}

	public boolean prompt(String message) {
		if (messageHandler == null)
			throw new RuntimeException("Kein Eventhandler definiert.");
		return messageHandler.prompt(message);		
	}	
	
	public void setPlayerMovementHandler(events.IPlayerMovementHandler playerMovementHandler) {
		this.playerMovementHandler = playerMovementHandler;
	}

	public void playerMoved(Player player, Field field) {
		if (playerMovementHandler != null)
			playerMovementHandler.playerMoved(player, field);
	}
	
	public void setPurchaseHandler(events.IPurchaseHandler purchaseHandler) {
		this.purchaseHandler = purchaseHandler;
	}

	public void playerBoughtHouse(Player player, PropertyField field) {
		if (purchaseHandler != null)
			purchaseHandler.playerBoughtHouse(player, field);
	}
	
	public void playerBoughtHotel(Player player, PropertyField field) {
		if (purchaseHandler != null)
			purchaseHandler.playerBoughtHotel(player, field);
	}

}
