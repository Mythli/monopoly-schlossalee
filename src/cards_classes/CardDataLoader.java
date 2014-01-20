package cards_classes;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.io.File;


public class CardDataLoader {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	
	static ArrayList<Card> cards;
	
	public static CardCollection load(String data) throws Exception {		
		
		cards = new ArrayList<Card>();		
		
		ObjectMapper mapper = new ObjectMapper();
		SerializedCard[] rawCards = mapper.readValue(new File("data/" + data), SerializedCard[].class);		
			
		for (SerializedCard rawCard : rawCards) {
			CardData cardData = rawCard.data;
			
			if (rawCard.className.equals("TransactionCard"))
				cards.add(new TransactionCard(cardData));
			else if (rawCard.className.equals("GoToCard"))
				cards.add(new GoToCard(cardData));
			else if (rawCard.className.equals("PayOrDrawCard"))
				cards.add(new PayOrDrawCard(cardData));
			else if (rawCard.className.equals("CollectMoneyCard"))
				cards.add(new CollectMoneyCard(cardData));
			else if (rawCard.className.equals("GetOutOfJailCard"))
				cards.add(new GetOutOfJailCard(cardData));
			else if (rawCard.className.equals("GoToRelativeCard"))
				cards.add(new GoToRelativeCard(cardData));
			else if (rawCard.className.equals("MaintenanceCard"))
				cards.add(new MaintenanceCard(cardData));
			else if (rawCard.className.equals("GoToJailCard"))
				cards.add(new GoToJailCard(cardData));
			else if (rawCard.className.equals("GetOutOfJailCard"))
				cards.add(new GetOutOfJailCard(cardData));
			
			else
				throw new Exception("Unknown card type " + rawCard.className);
		}
		
		return new CardCollection(cards);		
	}

}
