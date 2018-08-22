package utilities;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class JsonUtilities {


     public static LinkedList<JSONObject>  getJsonObjectsFromFile(String filePath){

         LinkedList<JSONObject> jsonObjects = new LinkedList<JSONObject>();
         JSONParser jsonParser = new JSONParser();
         JSONObject jsonObject;

         try {

             BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             while(bufferedReader.readLine() != null) {
                 jsonObject = (JSONObject) jsonParser.parse(bufferedReader.readLine());
                 jsonObjects.add(jsonObject);
                 System.out.println(jsonObject);
             }


         } catch (FileNotFoundException e) {
             e.printStackTrace();
             return null;
         } catch (ParseException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

        return  jsonObjects;
     }

}
