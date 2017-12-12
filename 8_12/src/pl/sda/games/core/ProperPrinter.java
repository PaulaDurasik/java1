package pl.sda.games.core;

public class ProperPrinter {
	private int number;
	
	public ProperPrinter() {
		this.number = 30;
	}
	
	public ProperPrinter(int number) {
		this.number = number;
	}
	
	public void delim() {
		this.generateBar("+", "-");
	}
	
	public void spacer() {
		this.generateBar("|", " ");
	}
	
	private void generateBar(String corner, String fill) {
		String str = "";
		for(int i = 0; i < this.number - 2; i++) {
			str += fill;
		}
		System.out.println(corner + str + corner);
	}
	
	public void print(String txt) {
		/* dklarujemy pusty ci�g znak�w */
		String temp = "";
		/* deklarujemy zminn� przetrzymuj�c� liczb� linii tekstu */ 
		int lines = (int) Math.ceil(txt.length() / this.number) + 1;
		/* deklarujemy zmienn� z ilo�ci� znak�w w linii */
		int numOfCharInLine = (txt.length() / lines) - 4;

		if(lines == 1) {
			int n = (this.number - txt.length() - 2) / 2;
			String spacer = "";
			/* iterujemy si� tyle razy ile spacji powinni�my doklei� do ci�gu znak�w */
			for(int i = 0; i < n; i++) {
				spacer += " ";
			}
			/* drukujemy lini� */
			System.out.printf("|" + spacer + txt + spacer + 
					((txt.length() % 2 != 0) ? " " : "") + "|");
		} else {
			/* iterujemy si� poprzez linie */
			for(int j = 0; j <= lines; j++) {
				/* TEN WARUNEK JEST WYKORZYSTYWANY W OSTATNIEJ ITERACJI, 
				 * KIEDY TEKST W ZMIENNEJ txt MOZE BYC KROTSZY NIZ numOfCharInLine */
				/* jezeli dlugosc tekstu jest wieksza od ilosci znakow w linii */
				if(txt.length() > numOfCharInLine && numOfCharInLine > 0) {
					/* do zmiennej tymczasowej przypisz uciety tekst (od poczatku do ilosci znakow) */ 
			
						temp = txt.substring(0, numOfCharInLine);
				} else {
					/* w przeciwnym wypadku zostaw tekst */
					temp = txt;
				}
				/* deklarujemy zmienn� do generowania ilo�ci spacji umieszczanych przed tekstem, aby go wycentrowac */
				int n = (this.number - temp.length() - 2) / 2;
				/* deklarujemy zmienna tymczasowa przetrzymujac� ilo�� spacji */
				String spacer = "";
				/* iterujemy si� tyle razy ile spacji powinni�my doklei� do ci�gu znak�w */
				for(int i = 0; i < n; i++) {
					spacer += " ";
				}
				/* drukujemy lini� */
				System.out.println("|" + spacer + temp + spacer + 
						((temp.length() % 2 != 0) ? " " : "") + "|");
				
				/* jezeli nasz tekst jest dluzszy niz ilosc linii utnijmy go do nastepnej iteracji */
				if(txt.length() > numOfCharInLine && numOfCharInLine > 0) {
					txt = txt.substring(numOfCharInLine);
				}
	
			}
		}
	}
	
	public void println(String txt) {
		this.print(txt);
		System.out.println();
	}
}
