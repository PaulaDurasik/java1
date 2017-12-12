package zad7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AvgChecker {
	private final String path = "src\\zad7\\";
	private String filename;
	 
	public AvgChecker(String filename) {
		this.filename = filename;
	}
	
	public void process() {
		File f = new File(this.path + this.filename);
		String currentLine;
		double avg = 0.0, tempAvg = 0.0;
		int count = 0, i = 0;
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				currentLine = sc.nextLine();
				String[] tempArr = currentLine.split("\t");
				avg += (Double.parseDouble(tempArr[1]) 
						+ Double.parseDouble(tempArr[2]) 
						+ Double.parseDouble(tempArr[3])) / 3;
				count++;
			}
			avg /= count;
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		String[] allLines = new String[count];
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				allLines[i++] = sc.nextLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(f));
			for(i = 0; i < allLines.length; i++) {
				String[] tempStr = allLines[i].split("\t");
				tempAvg = (Double.parseDouble(tempStr[1]) 
						+ Double.parseDouble(tempStr[2])
						+ Double.parseDouble(tempStr[3])) / 3;
				if(tempAvg > avg) {
					pw.println(allLines[i]);
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		System.out.println(avg);
	}
}
