/* Dane jest osiedle bloków. Ka¿dy blok zawiera 2 klatki, 
 * po 2 piêtra (+ parter), na ka¿dym piêtrze znajduj¹ siê 
 * dwa mieszkania. Napisz skrypt, który wyœwietli adres 
 * ka¿dego mieszkania tak, aby mo¿na by³o zaadresowaæ kopertê. 
 * Bloki znajduj¹ siê tylko pod numerami nieparzystymi - 
 * pierwszy blok znajduje siê pod numerem 1. 
 * Funkcja powinna przyjmowaæ nazwê ulicy oraz ostatni numer, 
 * który wystêpuje na danej ulicy (mo¿e byæ parzysty lub nieparzysty) 
 * oraz na wyjœciu drukowaæ poszczególne adresy. 
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
