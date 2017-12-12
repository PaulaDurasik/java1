package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Words {
	private final String source = "src\\resources\\words.txt";
	private final String target = "src\\resources\\words.json";
	
	public void convertTXTToJSONFile() {
		File f = new File(this.source);
		JSONObject jo = new JSONObject();
		LinkedList<String> keys = new LinkedList<>();
		LinkedList<String> values = new LinkedList<>();
		int i = 1;
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				if(i % 2 != 0) {
					keys.add(sc.nextLine());
				} else {
					values.add(sc.nextLine());
				}
				i++;
			}
			for(i = 0; i < values.size(); i++) {
				jo.put(keys.get(i), values.get(i));
			}
			PrintWriter pw = new PrintWriter(new File(this.target));
			pw.println(jo);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
