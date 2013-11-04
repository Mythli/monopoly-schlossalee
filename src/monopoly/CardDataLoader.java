package monopoly;

import com.fasterxml.jackson.core.JsonGenerationException;


import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.io.File;

public class CardDataLoader {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	
	static ArrayList<Card> cards;
	
	public static CardCollection load(String data) throws Exception {		
		
		cards = new ArrayList<Card>();		
		
		ObjectMapper mapper = new ObjectMapper();
		SerializedCard[] rawCards = mapper.readValue(new File("data/" + data), SerializedCard[].class);		
			
		for (SerializedCard rawCard : rawCards)
			cards.add(new Card(rawCard));
		
		return new CardCollection(cards);		
	}

}
