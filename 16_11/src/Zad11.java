/* Napisz funkcjê, która przet³umaczy wybran¹ liczbê 
 * ca³kowit¹ z zakresu <0-999>, na jej odpowiednik s³ownie 
 * np. 123 -> sto dwadzieœcia trzy. 
 */
public class Zad11 {
	public void translateNumber(int n) {
		String temp = "";
		boolean isOne = false;
		int setki = (n - (n % 100)) / 100;
		int dziesiatki = (n % 100) / 10;
		int jednosci = n - (setki * 100) - (dziesiatki * 10);
		switch(setki) {
			case 1:
				temp += "sto ";
				break;
			case 2:
				temp += "dwiescie ";
				break;
			case 3:
				temp += "trzysta ";
				break;
			case 4:
				temp += "czterysta ";
				break;
			case 5:
				temp += "piecset ";
			case 6:
				temp += "szescset ";
				break;
			case 7:
				temp += "siedemset ";
				break;
			case 8:
				temp += "osiemset ";
				break;
			case 9:
				temp += "dziewiecset ";
				break;
		}
		switch(dziesiatki) {
			case 1:
				isOne = true;
				switch(jednosci) {
					case 0:
						temp += "dziesiêæ";
						break;
					case 1:
						temp += "jedenascie";
						break;
					case 2:
						temp += "dwanascie";
						break;
					case 3:
						temp += "trzynascie";
						break;
					case 4:
						temp += "czternascie";
						break;
					case 5:
						temp += "pietnascie";
						break;
					case 6: 
						temp += "szesnascie";
						break;
					case 7:
						temp += "siedemnascie";
						break;
					case 8:
						temp += "osiemnascie";
						break;
					case 9:
						temp += "dziewietnascie";
						break;
				}
				break;
			case 2:
				temp += "dwadziescia ";
				break;
			case 3:
				temp += "trzydziesci ";
				break;
			case 4:
				temp += "czterdziesci ";
				break;
			case 5:
				temp += "piecdziesiat ";
				break;
			case 6:
				temp += "szescdziesiat ";
				break;
			case 7:
				temp += "siedemdziesiat ";
				break;
			case 8:
				temp += "osiemdziesiat ";
				break;
			case 9:
				temp += "dziewiecdziesiat ";
				break;
		}
		if(!isOne) {
			switch(jednosci) {
				case 1:
					temp += "jeden";
					break;
				case 2:
					temp += "dwa";
					break;
				case 3:
					temp += "trzy";
					break;
				case 4:
					temp += "cztery";
					break;
				case 5:
					temp += "piec";
					break;
				case 6:
					temp += "szesc";
					break;
				case 7:
					temp += "siedem";
					break;
				case 8:
					temp += "osiem";
					break;
				case 9:
					temp += "dziewiec";
					break;
			}
		}
		System.out.println(temp);
	}
}
