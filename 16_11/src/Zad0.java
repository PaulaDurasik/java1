/* Napisz funkcj� przyjmuj�c� dwa argumenty, tablic� liczb ca�kowitych
 * oraz liczb� ca�kowit�. Funkcja powinna zwraca� indeks,
 * pod kt�rym znajduje si� pierwsze wyst�pienie danego elementu, 
 * lub -1 je�eli taki element nie wyst�puje w tablicy. */
public class Zad0 {
	public int indexOf(int[] arr, int arg) {
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] == arg ) {
				return i;
			}
		}
		return -1;
	}
}
