package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import zad1.Sentence;
import zad2.Sentencer;
import zad3.MoneyConverter;
import zad4.TempConverter;
import zad5.LengthChecker;
import zad6.*;
import zad7.AvgChecker;

public class Wtorek_29_11 {
	public static void main(String[] args) throws FileNotFoundException {
		/*File f = new File("src\\main\\test.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		File f2 = new File("test2.txt");
		FileOutputStream fos = new FileOutputStream(f2);
		PrintWriter pw = new PrintWriter(fos);
		
		pw.println("XX Przyk³adowy tekst pochodz¹cy z naszej aplikacji.");
		pw.close();*/
		/*
		Sentencer s = new Sentencer();
		System.out.println(s.readSentence("test.txt"));
		
		s.writeSentence("mySentence.txt", "Przyk³adowy tekst");
		
		MoneyConverter mc = new MoneyConverter();
		System.out.println(mc.convert(100, "EUR"));
		
		System.out.println(mc.convert(100, "EUR", "USD"));
		
		
		TempConverter tc = new TempConverter();
		double[] temp = tc.readTemp("tempC.txt");
		tc.writeTemp(temp);
		
		LengthChecker lc = new LengthChecker();
		lc.make("words.txt", 9);
		
		University u = new University();
		Student s = new Student();
		
		s = u.getStudent(1123123);
		System.out.println(s.getName() + " " + s.getSecondName());*/
		
		AvgChecker av = new AvgChecker("marks.txt");
		av.process();
	}
}
