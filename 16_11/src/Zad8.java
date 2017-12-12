/* Dane jest osiedle blok�w. Ka�dy blok zawiera 2 klatki, 
 * po 2 pi�tra (+ parter), na ka�dym pi�trze znajduj� si� 
 * dwa mieszkania. Napisz skrypt, kt�ry wy�wietli adres 
 * ka�dego mieszkania tak, aby mo�na by�o zaadresowa� kopert�. 
 * Bloki znajduj� si� tylko pod numerami nieparzystymi - 
 * pierwszy blok znajduje si� pod numerem 1. 
 * Funkcja powinna przyjmowa� nazw� ulicy oraz ostatni numer, 
 * kt�ry wyst�puje na danej ulicy (mo�e by� parzysty lub nieparzysty) 
 * oraz na wyj�ciu drukowa� poszczeg�lne adresy. 
 */
public class Zad8 {
	public void printAdressess(String street, int number) {
		String staircase = "A";
		for(int i = 1; i <= number; i += 2) {
			for(int j = 1; j <= 12; j++) {
				staircase = (j <= 6) ? "A" : "B";
				System.out.println("ul. " + street + " " + i + "/" + staircase + "/" + j);
			}
		}
	}
}
