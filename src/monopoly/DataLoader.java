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
		
		int position = 0;
		for (SerializedField rawField : rawFields) {
			PropertyData data = rawField.data;
			data.setPosition(position);
			if (rawField.className.equals("Street"))
				fields.add(new Street(data));
			else if (rawField.className.equals("CardStack"))
				fields.add(new CardStack(data));
			else if (rawField.className.equals("ActionField"))
				fields.add(new ActionField(data));
			else if (rawField.className.equals("Trainstation"))
				fields.add(new TrainStation(data));
			else if (rawField.className.equals("SupplyStation"))
				fields.add(new SupplyStation(data));
			else if (rawField.className.equals("Prison"))
				fields.add(new Prison(data));
			else if (rawField.className.equals("Field"))
				fields.add(new Field(data));
			else
				throw new Exception("Unknown field type " + rawField.className);
			position++;
		}
		
		GameBoard gameBoard = new GameBoard(fields);
		
		return gameBoard;		
	}

}
