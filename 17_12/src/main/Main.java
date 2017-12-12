package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static final String namesM = "src\\resources\\im_m.txt";
	private static final String namesF = "src\\resources\\im_f.txt";
	private static final String secondNames = "src\\resources\\nazwiska.txt";
	
	private static final String[] prefixes = { "ks.", "gen.", "œw.", "o.", "abpa" };

	public static void main(String[] args) throws FileNotFoundException {
		/*File f = new File("src\\resources\\ulice.txt");
		Scanner s = new Scanner(f);
		PrintWriter pw = new PrintWriter(new File("src\\resources\\ulice_popr.txt"));
		int i = 1;
		String currentLine = "";
		String[] arr;
		while(s.hasNextLine()) {
			currentLine = s.nextLine().replace("ul.	", "");
			pw.println(currentLine);
			i++;
		}
		s.close();
		pw.close();*/
		Main m = new Main();
		for(int i = 0; i < 300; i++) {
			int lines = m.countLines("ulice_popr.txt");
			Random r = new Random();
			int myName = r.nextInt(lines) + 1;
			
			String myStreet = m.getRecordByLineNumber("ulice_popr.txt", myName);
			myStreet = myStreet.replace("\t", " ");
			String firstLetter = "" + myStreet.charAt(0);
			if(m.checkIfStreetPrefixNeeded(myStreet)) {
				myStreet = "ul. " + myStreet;
			}
			
			//System.out.println(myStreet);
		}
		//System.out.println(m.generatePESEL());
		User u = new User(m.generatePESEL());
		System.out.println(u);
		System.out.println(new User(m.generatePESEL()));
		/*Random rr = new Random(100);
		for(int i = 0; i< 100; i++) {
			System.out.println(rr.nextInt());
		}*/
		
	}
	
	public boolean checkIfStreetPrefixNeeded(String street) {
		String firstLetter = street.charAt(0) + "";
		if(firstLetter.equals(firstLetter.toLowerCase())) {
			for(String s: this.prefixes) {
				if(street.startsWith(s)) {
					return true;
				}
			}
			return false;
		}
		return true;
	}
	
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
	
	public String generatePESEL() {
		String PESEL = "";
		int min = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int max = (int) LocalDate.of(1999, 12, 31).toEpochDay();
		Random r = new Random();
		int randomNumber = r.nextInt(max - min) + min;
		LocalDate ld = LocalDate.ofEpochDay(randomNumber);
		String day = leadZero("" + ld.getDayOfMonth()), 
			month = leadZero("" + ld.getMonthValue()), 
			year = "" + ld.getYear();
		PESEL = year.substring(2) + month + day;
		
		PESEL += this.generateSerialNumber();
		PESEL += this.getControlSumOfPESEL(PESEL);
		//System.out.println(PESEL + " | " + day + "." + month + "." + year);
		return PESEL;
	}
	
	private String leadZero(String arg) {
		return (arg.length() < 2) ? "0" + arg : arg;
	}
	
	private String generateSerialNumber() {
		String temp = "";
		Random r =  new Random();
		for(int i = 0; i < 4; i++) {
			temp += "" + r.nextInt(10);
		}
		return temp;
	}
	
	private String getControlSumOfPESEL(String p) {
		int[] values = { 9, 7, 3, 1, 9, 7, 3, 1, 9, 7 };
		
		int sum = 0;
		if(values.length == p.length()) {
			for(int i = 0; i < values.length; i++) {
				sum += values[i] * Integer.parseInt(p.charAt(i) + "");
			}
		}
		return (sum % 10) + "";
	}
	
	private String generateVISANumber() {
		String VISA = "";
		for(int i = 0; i < 4; i++) {
			VISA += generateSerialNumber();
			if(i < 3) {
				VISA += " ";
			}
		}
		return VISA;
	}

}
