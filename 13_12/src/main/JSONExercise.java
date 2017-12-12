package main;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONExercise {
	public void createSimpleJSON() {
		JSONObject jo = new JSONObject();
		
		jo.put("klucz", "wartosc");
		jo.put("inny klucz", 55);
				
		JSONArray ja = new JSONArray();
		ja.add(new Integer(7));
		ja.add("simpleString");
		
		jo.put("array", ja);
		
		//ja.get(0);
		
		System.out.println(jo);
		
	}
}