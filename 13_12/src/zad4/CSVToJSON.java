package zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CSVToJSON {
	private final String filename = "src\\resources\\students.csv";
	
	public void readCSVfile() {
		try {
			Scanner sc = new Scanner(new File(this.filename));
			String currLine = "";
			String[] header = null;
			String[] currRecord = null;
			int i = 0;
			JSONArray ja = new JSONArray();
			while(sc.hasNextLine()) {
				currLine = sc.nextLine();
				if(i == 0) {
					header = currLine.split(";");
				} else {
					currRecord = currLine.split(";");
					JSONObject o = new JSONObject();
					for(int j = 0; j < header.length; j++) {
						o.put(header[j], currRecord[j]);
					}
					ja.add(o);
				}
				i++;
				
			}
			System.out.println(ja);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
