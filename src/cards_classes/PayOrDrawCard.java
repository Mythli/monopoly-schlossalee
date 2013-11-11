package cards_classes;

public class PayOrDrawCard extends Card {
	
	PayOrDrawCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("PayOrDrawCard");
		System.out.println(data.getText());
	}

}
