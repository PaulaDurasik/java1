package main;

import java.io.FileNotFoundException;
import java.util.Random;

public class Address {
	private String street;
	private String city;
	private String zip;
	private String number;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Address(String street, String city, String zip, String number) {
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.number = number;
	}
	
	public Address() throws FileNotFoundException {
		Helper h = new Helper();
		Random r = new Random();
		int allLines = h.countLines("ulice_popr.txt");
		int rLine = r.nextInt(allLines) + 1;
		this.street = h.getRecordByLineNumber("ulice_popr.txt", rLine);
		
		allLines = h.countLines("miasta.txt");
		rLine = r.nextInt(allLines) + 1;
		this.city = h.getRecordByLineNumber("miasta.txt", rLine);
		
		this.number = r.nextInt(100) + 1 + "";
		
		this.zip = "12-123";
	}
	
}
