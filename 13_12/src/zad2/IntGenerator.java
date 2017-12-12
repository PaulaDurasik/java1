package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

import org.json.simple.JSONArray;

public class IntGenerator {
	
	private final String path = "src\\resources\\";
	
	public int[] generateIntArray() {
		Random r = new Random();
		int[] arr = new int[r.nextInt(100) + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		return arr;
	}
	
	public JSONArray convertArrayToJSON(int[] arr) {
		JSONArray ja = new JSONArray();
		for(int i = 0; i < arr.length; i++) {
			ja.add(arr[i]);
		}
		return ja;
	}
	
	public void saveJSONToFile(String filename, String content) {
		File f = new File(this.path + filename);
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			pw.println(content);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
