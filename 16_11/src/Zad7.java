/* Napisz funkcj�, kt�ra jako argument przyjmuje 
 * dodatni� liczb� ca�kowit� wi�ksz� od zera. 
 * Dla podanego zakresu wydrukuj kolejne warto�ci pomijaj�c te, 
 * kt�re s� podzielne przez 3 lub przez 4 
 */
public class Zad7 {
	public void printNumbersNotDividedBy(int n) {
		for(int i = 0; i <= n; i++) {
			if(i % 3 != 0 && i % 4 != 0) {
				System.out.println(i);
			}
		}
	}
}
