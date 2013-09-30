package monopoly;

public class Player extends Participant {

	private String name;
	private int currentMoney;

	public Player(String name) {
		this.name = name;
		this.currentMoney = 15000;
	}

	public int getCurrentMoney() {
		return 0;
	}

	public void giveMoneyToParticipant(Participant player, int amount) {

	}

	public void addMoney(int value) {

	}

	public Field getCurrentField() {
		return null;
	}

	public void move(Field field) {

	}

	public void move(int value) {

	}
}
