/* Napisz funkcj�, sprawdzaj�c� czy przekazany argument (String) 
 * jest palindromem (nale�y uwzgl�dni� pomijanie spacji). 
 */
public class Zad9 {
	public boolean isPalindrome(String arg) {
		String temp = "";
		String[] arrOfStrings = arg.toLowerCase().replace(" ", "").split("");
		for(int i = arrOfStrings.length - 1; i >= 0; i--) {
			temp += arrOfStrings[i];
		}
		return arg.replace(" ", "").toLowerCase().equals(temp);
	}
}
