package zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class University {
	
	private final String path = "src\\zad6\\students.txt";
	
	private boolean isStudentExists(int index) {
		File f = new File(this.path);
		String temp = "";
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				temp = sc.nextLine();
				String[] tempArr = temp.split("\t");
				if(Integer.parseInt(tempArr[0]) == index) {
					return true;
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return false;
	}
	
	public Student getStudent(int index) {
		File f = new File(this.path);
		String line = "";
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				line = sc.nextLine();
				String[] tempArr = line.split("\t");
				if(Integer.parseInt(tempArr[0]) == index) {
					return new Student(Integer.parseInt(tempArr[0]), 
								tempArr[1], tempArr[2], tempArr[3], 
								Double.parseDouble(tempArr[4].replace(",", ".")));
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return null;
	}
	
	public void putStudent(Student student) {
		if(!this.isStudentExists(student.getIndex())) {
			try {
				PrintWriter pw = new PrintWriter(new FileOutputStream(
						new File(this.path), true));
				pw.println(student.getIndex() + "\t" + student.getName() 
							+ "\t" + student.getSecondName() + "\t" 
							+ student.getCourse() + "\t" + student.getAverageMark());
				pw.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}
