/* Napisz funkcj�, kt�ra dla wczytanego od 
 * u�ytkownika s�owa, wy�wietla jego litery 
 * w kolejno�ci odwrotnej. 
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
