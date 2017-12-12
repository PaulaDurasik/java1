package zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LengthChecker {
	
	private final String path = "src\\zad5\\";
	
	private boolean isProperLength(String arg, int len) {
		return arg.length() > len;
	}
	
	private String[] readFile(String filename) {
		String[] temp = new String[this.getNumOfLines(filename)];
		File f = new File(this.path + filename);
		int i = 0;
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				temp[i] = sc.nextLine();
				i++;
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return temp;
	}
	
	private void writeFile(String[] fileContent, int len) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(
					new File(this.path + "words_" + len + ".txt")));
			for(int i = 0; i < fileContent.length; i++) {
				if(this.isProperLength(fileContent[i], len)) {
					pw.println(fileContent[i]);
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	
	private int getNumOfLines(String filename) {
		File f = new File(this.path + filename);
		Scanner sc;
		int i = 0;
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				++i;
				sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return i;
	}
	
	public void make(String fileInput, int len) {
		this.writeFile(this.readFile(fileInput), len);
	}
}
