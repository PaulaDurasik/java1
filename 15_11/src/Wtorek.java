import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
public class Wtorek {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("qwe");
		al.add("zxc");
		HashSet<String> ss = new HashSet<>();
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("zxc55", "qwe55");
		System.out.println(hm.get("zxc55"));
		/*Zad1 z1 = new Zad1();
		Zad2 z2 = new Zad2();
		Zad3 z3 = new Zad3();
		Zad5 z5 = new Zad5();
		Zad6 z6 = new Zad6();
		Zad7 z7 = new Zad7();
		
		System.out.println(z1.shortAbs(-5));
		System.out.println(z1.shortAbs(0));
		System.out.println(z1.shortAbs(33));
		
		z2.getDayOfTheWeekTwo(-3);
		z2.getDayOfTheWeekTwo(0);
		z2.getDayOfTheWeekTwo(5);
		z2.getDayOfTheWeekTwo(13);
		
		
		System.out.println( z3.getMonth(3) );
		System.out.println( z3.getMonth(-3) );
		System.out.println( z3.getMonth(13) );
		
		
		
		z5.printNumbersOtherWay(3, 8);,
		
		
		System.out.println(z6.squares(-3));
		System.out.println(z6.squares(0));
		System.out.println(z6.squares(16));
		System.out.println(z6.squares(7));
		
		System.out.printf("%.2f \n", z7.countMoney(1000, 2));
		
		
		int[] arrOfInts = { -5, 3, 2, 1, 10 };
		Zad8 z8 = new Zad8();
		System.out.println( z8.countDifference(arrOfInts) );
		
		for(Status i : Status.values()) {
            System.out.println(i.getId() + " " + i.getName());
        }*/
	}

}
