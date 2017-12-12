package pl.sda.games.games;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import pl.sda.games.core.Playable;

public class GuessWord implements Playable {
	/* deklaracja pól prywatnych */
	private String word; 
	private final String name = "Zgaduj wyraz";
	private File f = new File("src\\resources\\words.txt");

	
	/* konstruktory */
	public GuessWord() {
		/* do pola prywatnego przetrzymujacego slowo do zgadniecia wczytujemy slowo z pliku;
		 * metoda countLines() - zwraca liczbê linii w pliku
		 * metoda getLine() - zwraca cal¹ liniê */
		this.word = getLine(new Random().nextInt(countLines()));
	}
	
	public GuessWord(String word) {
		this.word = word;
	}

	/* gettery i settery */
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String getName() {
		return name;
	}
	
	/* metoda wczytuj¹ca od u¿ytkownika i zwracaj¹ca pierwsz¹ literkê */
	private String getLetter() {
		Scanner sc = new Scanner(System.in);
		/* prosimy uzytkownika o podanie litery */
		System.out.println("Podaj literkê: ");
		/* wczytujemy litere, nastepnie obcinamy ja do 1 znaku, nastepnie zwracamy jako mala litere */
		String ret = sc.nextLine().substring(0, 1).toLowerCase();
		//sc.close();
		return ret;
	}
	
	/* metoda zliczajaca liczbe linii w pliku */
	private int countLines() {
		/* deklarujemy poczatkowa ilosc linii */
		int lines = 0;
		try {
			/* tworzymy nowa instancje Scannera */
			Scanner sc = new Scanner(this.f);
			/* dopóki u¿ytkownik nie poda znaków */
			while(sc.hasNextLine()) {
				/* zwiêksz o 1 zmienn¹ przetrzymuj¹c¹ iloœæ linii */
				lines++;
				/* przeskocz wczytywanie */
				sc.nextLine();
			}
			sc.close();
		/* gdy nie znajdziemy podanego pliku, zlap wyjatek: */
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		/* zwroc liczbe linii */
		return lines;
	}
	
	/* metoda zwracajaca wybrana linie z pliku */
	private String getLine(int line) {
		/* deklarujemy zmienna tymczasowa przetrzymujaca aktualna linie */
		String currentLine = "";
		/* deklarujemy zmienna przetrzymujaca aktualny numer linii */
		int counter = 1;
		try {
			Scanner sc = new Scanner(this.f);
			/* dopóki w pliku s¹ linie */
			while(sc.hasNextLine()) {
				/* do zmiennej tymczasowej currentLine przypisz aktualn¹ liniê z pliku */
				currentLine = sc.nextLine();
				/* jezeli numer linii odpowiada przekazanemy numerowi jako parametr */
				if(line == counter) {
					/* zwracamy aktualnie odczytana linie */
					sc.close();
					return currentLine;
				}
				/* zwiekszamy licznik */
				counter++;
			}
			//sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		/* zwracamy linie */
		return currentLine;
	}

	@Override
	public void run() {
		game();
	}

	@Override
	public void game() {
		/* deklarujemy pusta zmienna do przetrzymywania aktualnej literki */
		String currentLetter = "";
		/* deklarujemy zmienna do przetrzymywania ciagu zuzytych literek */
		String usedLetters = "";
		
		/* dopoki:
		 * odgadniete slowo nie jest takie samo jak wylosowane  */
		while(!maskString(usedLetters).replace(" ", "").equalsIgnoreCase(this.word)) {
			/* spytaj uzytkownika o literke */
			System.out.println("Twoje s³owo to: ");
			System.out.println("\t" + maskString(usedLetters));
			System.out.println("U¿yte literki: " + usedLettersChain(usedLetters));
			/* pobierz i przypisz do zmiennej currentLetter nowa literke */
			currentLetter = getLetter();
			
			/* jezeli uzytkownik do tej pory nie podal takiej literki, to dodaj ja 
			 * do ciagu zuytych literek */
			if(!usedLetters.contains(currentLetter)) {
				usedLetters += currentLetter;
			}
		}
		/* poinformuj uzytkownika o koncu gry */
		System.out.println("*** KONIEC ***");
	}
	
	/* metoda sluzaca do zamaskowania slowa */
	private String maskString(String letters) { 
		/* deklarujemy zmienna tymczasowa jako pusty ciag znakow */
		String temp = "";
		
		/* iterujemy sie przez dlugosc slowa (wylosowanego do zgadniecia) */
		for(int i = 0; i < this.word.length(); i++) {
			/* Do nowo zainicjalizowanej zmiennej s przypisujemy aktualnie iterowana literke w slowie */
			String s = "" + this.word.charAt(i);
			/* jezeli literka wystapila juz wczesniej to ja odkrywamy */
			if(letters.contains(s)) {
				temp += s.toUpperCase() + " ";
			/* w przeciwnym razie maskujemy */
			} else {
				temp += "_ ";
			}
		}
		
		/* zwracamy zamaskowany wyraz */
		return temp;
	}
	
	/* metoda generujaca lancuch zuzytych literek */
	private String usedLettersChain(String usedLetters) {
		/* deklarujemy zmienna tymczasowa */
		String tempStr = "";
		/* iterujemy sie przez dlugosc zuzytyc literek */
		for(int i = 0; i < usedLetters.length(); i++) {
			/* doklejamy do tymczasowego ciagu znakow literke jako du¿¹ */
			tempStr += usedLetters.charAt(i) + " ";
		}
		/* nastêpnie zwracamy tymczasowy ci¹g znaków */
		return tempStr.toUpperCase();
	}
	
}