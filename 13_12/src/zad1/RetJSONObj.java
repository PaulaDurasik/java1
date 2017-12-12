package zad1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class RetJSONObj {
	public void createJSON() {

		JSONObject root = new JSONObject();
		root.put("pierwszy", "przyk³ad");
		root.put("drugi", "inny przyk³ad");
		root.put("liczba", 5);
		JSONArray ja = new JSONArray();
		for(int i = 1; i <= 5; i++) ja.add(i);
		root.put("tablica", ja);
		JSONObject jo = new JSONObject();
		jo.put("x", 5);
		jo.put("y", 17);
		
		root.put("obiekt", jo);
		
		System.out.println(root);
	}
}
