/* Dla zadanej tablicy elementów liczb ca³kowitych, 
 * napisz program, który poka¿e ró¿nicê najwiêkszego 
 * oraz najmniejszego elementu, przyk³adowo, tablica 
 * zawiera elementy -5, 3, 2, 1, 10, wynik powinien 
 * wynosiæ 15, gdy¿ -5 to najmniejszy element, a 10
 * to najwiêkszy.  
 */
public class Zad8 {
	public int countDifference(int[] arr) {
		int max = arr[0], min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		return max - min; 
	}
}
