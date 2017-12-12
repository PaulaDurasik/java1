/* Napisz funkcjê przyjmuj¹c¹ dwa argumenty, tablicê liczb ca³kowitych
 * oraz liczbê ca³kowit¹. Funkcja powinna zwracaæ indeks,
 * pod którym znajduje siê pierwsze wyst¹pienie danego elementu, 
 * lub -1 je¿eli taki element nie wystêpuje w tablicy. */
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
