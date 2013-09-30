package monopoly;

public class Bank extends Participant {

	public int getCurrentMoney() {
		return 9999999;
	}

	public void giveMoneyToParticipant(Participant player, int amount) {
		player.addMoney(amount);
	}

	public void addMoney(int value) {
		//
	}

	@Override
	public void removeMoney(int value) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
