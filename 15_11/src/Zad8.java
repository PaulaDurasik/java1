/* Dla zadanej tablicy element�w liczb ca�kowitych, 
 * napisz program, kt�ry poka�e r�nic� najwi�kszego 
 * oraz najmniejszego elementu, przyk�adowo, tablica 
 * zawiera elementy -5, 3, 2, 1, 10, wynik powinien 
 * wynosi� 15, gdy� -5 to najmniejszy element, a 10
 * to najwi�kszy.  
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
