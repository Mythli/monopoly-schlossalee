package monopoly;

public abstract class Participant {

	public abstract int getCurrentMoney();

	public abstract void giveMoneyToParticipant(Participant player, int amount);

	public abstract void addMoney(int value);

}
