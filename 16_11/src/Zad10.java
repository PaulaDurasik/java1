/* Napisz zadanie które wyœwietla wszystkie liczby pierwsze 
 * z zakresu od 1 do 100. 
 */
public class Zad10 {
	public void printPrimeNumbers(int n) {
		for(int i = 2; i <= n; i++) {
			if(this.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public boolean isPrime(int n) {
		boolean prime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
