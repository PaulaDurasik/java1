/* Napisz funkcjê, która jako argument przyjmuje 
 * dodatni¹ liczbê ca³kowit¹ wiêksz¹ od zera. 
 * Dla podanego zakresu wydrukuj kolejne wartoœci pomijaj¹c te, 
 * które s¹ podzielne przez 3 lub przez 4 
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
