package czwartek;

import java.util.Scanner;

public class Czwartek_17_11 {

	public static void main(String[] args) {
		int[][] myArray = { { 1, 2, 3 }, { 21, 7, 4 }, { 56, 14, -2} };
		String[] log = new String[10];
		
		Zad1 z1 = new Zad1();
		Zad2 z2 = new Zad2();
		Zad3 z3 = new Zad3();
		Zad4 z4 = new Zad4();
		Zad5 z5 = new Zad5();
		Zad6 z6 = new Zad6();
		Zad7 z7 = new Zad7();
		Zad8 z8 = new Zad8();
		int[] retArr = z8.sumEvenNumbersInRows(myArray);
		
		System.out.println( "Suma elementow % 7: " + z1.addElementsDividedBySeven(myArray) );
		System.out.println( "Iloczyn elementow: " + z2.multiplyElements(myArray) );
		System.out.println( "Iloczyn elementow parzystych: " + z3.multiplyEvenElements(myArray) );
		System.out.println( "Iloczyn elementow nieparzystych: " + z4.multiplyOddElements(myArray) );
		System.out.println( "Iloczyn elementow % 3: " + z5.multiplyElementsDividedByThree(myArray) );
		System.out.println( "Minimalny element w tablicy: " + z6.find2DArrayMin(myArray) );
		System.out.println( "Maksymalny element w tablicy: " + z7.find2DArrayMax(myArray) );
		
		for(int i = 0; i < retArr.length; i++) {
			System.out.println(i + " | suma elementow: " + retArr[i]);
		}
		
		Matrix matrix = new Matrix();
		
		int[][] testArr = new int[3][3];
		testArr = matrix.indexedMatrix(testArr);
		matrix.print2DArray(testArr);
		
		
		
	}

}
