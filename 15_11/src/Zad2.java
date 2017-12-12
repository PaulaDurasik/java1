/* Napisz funkcjê drukuj¹c¹ do konsoli
 * dzieñ tygodnia na podstawie przekazanego parametru.
 * Sprawdz, czy dzien nie wykracza poza zakres,
 * jesli tak zwroc blad. Wykorzystaj konstrukcjê 
 * switch...case
 */
public class Zad2 {
	public void getDayOfTheWeek(int day) {
		switch(day) {
			case 1: 
				System.out.println("Pon");
				break;
			case 2: 
				System.out.println("Wto");
				break;
			case 3: 
				System.out.println("Sr");
				break;
			case 4: 
				System.out.println("czw");
				break;
			case 5: 
				System.out.println("Pia");
				break;
			case 6: 
				System.out.println("Sob");
				break;
			case 7: 
				System.out.println("Nd");
				break;
			default:
				System.out.println("Taki dzien nie istnieje");
				break;
		}
	}
	
	
	public void getDayOfTheWeekTwo(int day) {
		String myDay;
		switch(day) {
			case 1: 
				myDay = "Pon";
				break;
			case 2: 
				myDay = "Wto";
				break;
			case 3: 
				myDay = "Sr";
				break;
			case 4: 
				myDay = "czw";
				break;
			case 5: 
				myDay = "Pia";
				break;
			case 6: 
				myDay = "Sob";
				break;
			case 7: 
				myDay = "Nd";
				break;
			default:
				myDay = "Taki dzien nie istnieje";
				break;
		}
		System.out.println(myDay);
		
	}
}
