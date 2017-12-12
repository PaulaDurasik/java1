/* Napisz funkcj�, kt�ra dla zadanej liczby zwr�ci 
 * sum� kwadrat�w poszczeg�lnych liczb od 1 do zadanej liczby. 
 * Przyjmij i zbadaj czy u�ytkownik przekaza� 
 * liczb� w przedziale <0, 10>  
 */
public class Zad6 {
	public int squares(int n) {
		if(n < 0 || n > 10) {
			return -1;
		}
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum += i * i;
			/* sum = sum + ( i * i ) */
		}
		
		return sum;
	}
}
