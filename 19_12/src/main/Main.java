package main;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/* wowolujemy metode getTstData, ktora generuje nam tablice z 5000 losowych liczba z zakresu 0..999 */
		int[] tab = Main.getTestData(5000); //{3, -2, 4, 0, 123, -17, 9};
		
		/* tworzymy instancje obiektu Sorting */
		Sorting s = new Sorting();
		/* deklarujemy aktualny czas w milisekundach, ktory uplynal od 1.1.1970 jako poczatkowy czas mierzenia czasu wykonania */
		long start = System.currentTimeMillis();
		/* deklarujemy nowow zmienna sorted, do ktorej przypisujemy posortowana tablice metoda babelkowa */
		int[] sorted = s.bubbleSort(tab);
		/* wyswietlamy czas wykonania sorotwania */
		System.out.println("Czas sortowania wyniós³: " + (System.currentTimeMillis() - start));
		/* drukujemy posortowana tablice */
		Main.printArr(sorted);
 	}
	
	public static void printArr(int[] arr) {
		String tmp = "";
		if(arr.length > 0) {
			tmp += "[ ";
			for(int i = 0; i < arr.length; i++) {
				tmp += arr[i];
				if(i < arr.length - 1) tmp += ", ";
			}
			tmp += " ]";
		}
		System.out.println(tmp);
	}

	public static int[] getTestData(int n) {
		/* deklarujemy tablice poczatkowa  */
		int[] arr = new int[n];
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			/* uzupelniamy tablice losowymi wartosciami z zakresu 0..1000 */
			arr[i] = r.nextInt(1000);
		}
		return arr;
	}
}
