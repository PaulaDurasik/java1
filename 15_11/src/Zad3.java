/* Napisz funkcj� zwracaj�c� miesi�c 
 * na podstawie przekazanego parametru.
 * Wykorzystaj tablic� String�w do przetrzymywania
 * nazw miesi�cy.
 */
public class Zad3 {
	public String getMonth(int month) {
		String[] months = {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lip", "Sie", "Wrze", "Paz", "Lis", "Gru" }; 
		if(month >= 1 && month <= 12) {
			return months[month - 1];
		}
		return "Nie ma takiego miesiaca!";
	}
}
