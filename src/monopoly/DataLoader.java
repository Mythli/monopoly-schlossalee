package monopoly;

import com.fasterxml.jackson.core.JsonGenerationException;


import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.io.File;

public class DataLoader {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	
	public static GameBoard load() throws Exception {		
		
		ArrayList<Field> fields = new ArrayList<Field>();		
		
		ObjectMapper mapper = new ObjectMapper();
		SerializedField[] rawFields = mapper.readValue(new File("data/fields.json"), SerializedField[].class);		
		
		for (SerializedField rawField : rawFields) {			
			if (rawField.className.equals("Street"))
				fields.add(new Street(rawField.data));
			else if (rawField.className.equals("CardStack"))
				fields.add(new CardStack(rawField.data));
			else if (rawField.className.equals("ActionField"))
				fields.add(new ActionField(rawField.data));
			else if (rawField.className.equals("Trainstation"))
				fields.add(new TrainStation(rawField.data));
			else if (rawField.className.equals("SupplyStation"))
				fields.add(new SupplyStation(rawField.data));
			else if (rawField.className.equals("Prison"))
				fields.add(new Prison(rawField.data));
			else if (rawField.className.equals("Field"))
				fields.add(new Field(rawField.data));
			else
				throw new Exception("Unknown field type " + rawField.className);
		}
		
		GameBoard gameBoard = new GameBoard(fields);
		
		return gameBoard;		
	}

}
