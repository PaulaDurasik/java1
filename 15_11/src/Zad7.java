/* Kasia ulokowa�a w banku pewna ilo�� z�otych na okres jednego roku. 
 * Oprocentowanie roczne w tym banku wynosi 19,4%. 
 * Napisz algorytm, kt�ry b�dzie oblicza� ilo�� pieni�dzy 
 * na koncie  po jednym roku dla dowolnej sumy pieni�dzy. 
 * Zmodyfikuj program tak, aby oblicza� kwot� dla wczytanej 
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
