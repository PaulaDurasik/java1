package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Helper {
	public int countLines(String filename) throws FileNotFoundException {
		Scanner s = new Scanner(new File("src\\resources\\" + filename));
		int i = 0;
		while(s.hasNextLine()) {
			i++;
			s.nextLine();
		}
		s.close();
		return i;
	}
	
	public String getRecordByLineNumber(String filename, int line) throws FileNotFoundException {
		Scanner s = new Scanner(new File("src\\resources\\" + filename));
		String ret = "";
		for(int i = 1; i < line; i++) {
			s.nextLine();
		}
		ret = s.nextLine();
		s.close();
		return ret;
	}
}
