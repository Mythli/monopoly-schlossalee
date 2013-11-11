package cards_classes;

public class CollectMoneyCard extends Card {
	
	CollectMoneyCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("CollectMoneyCard");
		System.out.println(data.getText());
	}

}
