/* Napisz funkcjê, która dla wczytanego od 
 * u¿ytkownika s³owa, wyœwietla jego litery 
 * w kolejnoœci odwrotnej. 
 */
public class Zad6 {
	public String reverseWord(String arg) {
		String[] arr = arg.split("");
		String temp = "";
		for(int i = arr.length - 1; i >= 0; i--) {
			temp += arr[i];
		}
		return temp;
	}
}
