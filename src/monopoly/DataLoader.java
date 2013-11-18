package monopoly;

import com.fasterxml.jackson.core.JsonGenerationException;


import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;

public class DataLoader {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
		
	public static GameBoard load() throws Exception {		
		
		ArrayList<Field> fields = new ArrayList<Field>();
		HashMap<String, Field> specialFields = new HashMap<String, Field>();
		
		ObjectMapper mapper = new ObjectMapper();
		SerializedField[] rawFields = mapper.readValue(new File("data/fields.json"), SerializedField[].class);	
		
		int position = 0;
		for (SerializedField rawField : rawFields) {			
			PropertyData data = rawField.data;
			data.setPosition(position);
			if (rawField.className.equals("Street")) {
				Street street = new Street(data);
				fields.add(street);
				specialFields.put(data.getName(), street);
			} else if (rawField.className.equals("CardStack"))
				fields.add(new cards_classes.CardStack(data));
			else if (rawField.className.equals("ActionField"))
				fields.add(new ActionField(data));
			else if (rawField.className.equals("Trainstation")) {
				TrainStation trainStation = new TrainStation(data);
				fields.add(trainStation);
				specialFields.put(data.getName(), trainStation);
			} else if (rawField.className.equals("SupplyStation"))
				fields.add(new SupplyStation(data));
			else if (rawField.className.equals("Prison")) {
				Prison prison = new Prison(data);
				fields.add(prison);
				specialFields.put(data.getName(), prison);
			} else if (rawField.className.equals("Field"))
				fields.add(new Field(data));
			else
				throw new Exception("Unknown field type " + rawField.className);			
				
			position++;
		}
		
		GameBoard gameBoard = new GameBoard(fields, specialFields);
		
		return gameBoard;		
	}	

}
