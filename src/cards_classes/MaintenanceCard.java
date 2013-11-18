package cards_classes;

public class MaintenanceCard extends Card {
	
	MaintenanceCard(CardData data) {
		super(data);
	}
	
	public void execute() {
		//System.out.println("GoToCard");
		System.out.println(data.getText());
	}

}