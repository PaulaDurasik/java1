package main;

import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import zad1.RetJSONObj;
import zad2.IntGenerator;
import zad3.Words;
import zad4.CSVToJSON;
import zad5.JSONToINI;

public class Main {

	public static void main(String[] args) {
		/*zad3  */
//		Words w = new Words();
//		w.convertTXTToJSONFile();
		/* zad4 */
//		CSVToJSON ctj = new CSVToJSON();
//		ctj.readCSVfile();
		
		/*
		 * JSONExercise e = new JSONExercise(); e.createSimpleJSON();
		 */
		// RetJSONObj r = new RetJSONObj();
		// r.createJSON();

		/*
		 * IntGenerator i = new IntGenerator(); int[] myArr =
		 * i.generateIntArray(); String str =
		 * i.convertArrayToJSON(myArr).toString();
		 * i.saveJSONToFile("randomInts.json", str);
		 */
/*
		String myJSON = "{\"lista\": [\"asd\",5,4.4,{\"asd\":\"qweqwe\",\"rty\":\"vbn\"}],\"asd\":12,\"qeqwe\":\"zxc\"}";
		JSONParser p = new JSONParser();

		try {
			Object o = p.parse(myJSON);
			int type = getObjectType(o);
			switch (type) {
				case 0:
					JSONArray ja = (JSONArray) o;
					printRJSONArray(ja);
					break;
				case 1:
					JSONObject oo = (JSONObject) o;
					printRJSONObject(oo);
					break;
				}
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
		
		JSONToINI jti = new JSONToINI();
		String s = jti.getJSONFromFile("file.json");
		jti.printKeys(s);
	}
}
