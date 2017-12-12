/* U�ytkownik podaje dwie liczby ca�kowite a, b. 
 * algorytm ma za zadanie wypisa� wszystkie 
 * parzyste liczby w kolejno�ci rosn�cej, a nast�pnie 
 * wszystkie liczby nieparzyste w kolejno�ci 
 * malej�cej z przedzia�u <a;b>. 
 * niech a, b �liczby ca�kowite z zakresu 0-255. 
 * Np. dla danych wej�ciowych a=3, b=8,
 * otrzymujemy: 4, 6, 8, 7, 5, 3. 
 */
public class Zad5 {
	public void printNumbers(int a, int b) {
		
		if(a < 0 || b < 0 || a > 255 || b > 255 || b < a) {
			return;
		}
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = b; i >= a; i--) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void printNumbersOtherWay(int a, int b) {
		
		if(a < 0 || b < 0 || a > 255 || b > 255 || b < a) {
			return;
		}
		
		for(int i = (a % 2 == 0) ? a : a+1; i <= b; i += 2) {
			System.out.println(i);
		}
		
		for(int i = (b % 2 != 0) ? b : b-1; i >= a; i -= 2) {
			System.out.println(i);
		}
	}
}
