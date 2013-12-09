package monopoly;

public class Bank extends Participant {

	public int getCurrentMoney() {
		return 9999999;
	}

	public void transferMoneyToParticipant(Participant player, int amount) throws Exception {
		player.addMoney(amount);
	}

	public void addMoney(int value) {
		// Keine Funktion
	}

	@Override
	public void removeMoney(int value) throws Exception {
		// Keine Funktion
	}
}
