/* Napisz funkcjê, która przyjmie dwa argumenty: 
 * liczbê znaków oraz zdanie. Funkcja powinna 
 * wypisaæ s³owa, które s¹ d³u¿sze ni¿ zadana 
 * liczba w pierwszym argumencie. 
 */
public class Zad4 {
	public void printNumbersByLength(String sentence, int length) {
		String[] tempTab = sentence.split(" ");
		for(String x : tempTab) {
			if(x.length() > length) {
				System.out.println(x);
			}
		}
	}
}
