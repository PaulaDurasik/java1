/* Kasia ulokowa³a w banku pewna iloœæ z³otych na okres jednego roku. 
 * Oprocentowanie roczne w tym banku wynosi 19,4%. 
 * Napisz algorytm, który bêdzie oblicza³ iloœæ pieniêdzy 
 * na koncie  po jednym roku dla dowolnej sumy pieniêdzy. 
 * Zmodyfikuj program tak, aby oblicza³ kwotê dla wczytanej 
 * liczby lat. 
 */
public class Zad7 {
	public double countMoney(double cash, int years) {
		double proc = 1.194;
		for(int i = 1; i <= years; i++) {
			cash *= proc;
		}
		return cash;
	}
}
