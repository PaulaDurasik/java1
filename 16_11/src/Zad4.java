/* Napisz funkcj�, kt�ra przyjmie dwa argumenty: 
 * liczb� znak�w oraz zdanie. Funkcja powinna 
 * wypisa� s�owa, kt�re s� d�u�sze ni� zadana 
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
