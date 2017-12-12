package main;
import java.util.ArrayList;
import java.util.Random;

import zad1.*;
import zad2.StaffNames;
import zad3.MaxMinID;
import zad4.Students;
import zad5.Companies;
import zad6.People;
import zad6.Person;
import zad7.Helper;
import zad7.XMLCounter;

public class Main {
	public static void main(String[] args) {
		/* XMLExercise */
//		XMLExercise xml = new XMLExercise();
//		try {
//			xml.readXMLFile("staff.xml");
//			xml.writeXMLFile("staff2.xml");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		/* zad1 */
//		EmployeeSalary es = new EmployeeSalary("staff.xml");
//		System.out.println( "Œrednia pensja pracowników: " + es.getAvgSalary() );
		
		/* zad2 */
//		StudentNames sn = new StaffNames();
//		ArrayList<String> staff = sn.getNames();
//		for(String staffMember: staff) {
//			System.out.println(staffMember);
//		}
		
		/* zad3 */
//		MaxMinID mmi = new MaxMinID("staff.xml");
//		mmi.getMinMaxStaffID();
		
		/* zad4 */
//		Students students = new Students();
//		students.saveStudentAsXML();
		
		/* zad5 */
//		Companies comp = new Companies();
//		comp.saveCompaniesAsXML();
		
		/* zad6 */
//		People p = new People();
//		ArrayList<Person> people = new ArrayList<>();
//		
//		people.add(new Person("Mietek", "Szczesniak", "Estrada", 5000, "scena", 1960));
//		people.add(new Person("Bill", "Gates", "Microsoft", 1000000, "senior", 1950));
//		people.add(new Person("Jane", "Doe", "Unknown", 0, "unknown", 0));
//		people.add(new Person("John", "Simple", "Test", 12345, "Case", 1900));
//		people.add(new Person("Last", "Person", "---", 45612, "---", 1956));
//		
//		p.savePeople(people);
		
		/* zad7 */
//		for(int i = 2; i <= 5; i++) {
//			Helper.saveXMLFile("plik_" + i + ".xml", 
//					Helper.generateListOfIntegers(15, 99, 
//							new Random().nextInt(10)));
//		}
//		XMLCounter xc = new XMLCounter();
//		System.out.println( "Œrednia danych z plików: " + xc.countAverage("plik_[n].xml", 3, 4) );
		
		/* zad8 */
	}
}
