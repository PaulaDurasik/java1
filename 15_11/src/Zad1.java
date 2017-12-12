/* Napisz funkcjê zwracaj¹c¹
 * wartoœæ bezwzglêdn¹ z liczby
 * przekazanej jako parametr
 */
public class Zad1 {
	
	public int abs(int x) {
		/* sprawdzamy czy liczba jest mniejsza od zera */
		if( x < 0 ) {
			/* jesli tak, zmieniamy jej znak */
			x = -x;
		}
		/* zwracamy liczbe */
		return x;
	}
	
	public int shortAbs(int x) {
		/* wersja skrocona wykorzystujaca short-if */
		return ( x < 0 ) ? -x : x;
	}
	
}
