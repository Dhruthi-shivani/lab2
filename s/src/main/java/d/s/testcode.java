package maven.lab6;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class demo {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\JSON\\demo.json");
		Object obj = jsonparser.parse(reader);
		JSONObject empjsonobj = (JSONObject)obj;
		
		String fname = (String) empjsonobj.get("firstname");
		String lname = (String) empjsonobj.get("lastname");
		
		System.out.println("first name:"+fname);
		System.out.println("Last name:"+lname);
		}
	}