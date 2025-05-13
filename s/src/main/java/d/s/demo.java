package d.s;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class demo {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try {
            // Using relative path for portability
            FileReader reader = new FileReader(".\\JSON\\me.json");

            // Parse the JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            // Extract data
            String fname = (String) jsonObject.get("firstname");
            String lname = (String) jsonObject.get("lastname");

            // Print output
            System.out.println("First name: " + fname);
            System.out.println("Last name: " + lname);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
