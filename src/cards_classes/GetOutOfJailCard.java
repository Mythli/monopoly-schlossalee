package cards_classes;

public class GetOutOfJailCard extends Card {
	
	GetOutOfJailCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GetOutOfJailCard");
		System.out.println(data.getText());
	}

}
