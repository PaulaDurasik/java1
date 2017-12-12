/* Napisz funkcjê zwracaj¹c¹ miesi¹c 
 * na podstawie przekazanego parametru.
 * Wykorzystaj tablicê Stringów do przetrzymywania
 * nazw miesiêcy.
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
