package monopoly;

public abstract class Participant {

	public abstract int getCurrentMoney();

	public abstract void transferMoneyToParticipant(Participant player, int amount) throws Exception;

	public abstract void addMoney(int value) throws Exception;
	
	public abstract void removeMoney(int value) throws Exception;

}
