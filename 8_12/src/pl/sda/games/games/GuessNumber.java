package pl.sda.games.games;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import pl.sda.games.core.Playable;
import pl.sda.games.core.Settable;

public class GuessNumber implements Playable, Settable {
	
	/* deklarujemy liczbê, któr¹ u¿ytkownik powinien odgadn¹æ */
	private int number; 
	/* deklarujemy pole z nazw¹ gry */
	private final String name = "Zgaduj liczbe";
	/* deklarujemy pole, ktore bedzie przetrzymywalo ustawienia gry */
	private HashMap<String, String> conf = new HashMap<>();
	
	
	/* tworzymy konstruktory bez i zparamatryzowany */
	public GuessNumber() {
		/* w konstruktorze niezparametryzowanym ustawiamy liczbê do zgadniêcia
		 * jako losowa¹ liczbê z przedzia³u <1, 100) */
		this.getConfig();
		/* do zmiennej a i b probujemy przypisac wynik sparsowania danych pobranych z pliku konfiguracyjnego */
		int a = Integer.parseInt(this.getValue("minRange")); // "10"
		int b = Integer.parseInt(this.getValue("maxRange")); // "100"
		this.number = new Random().nextInt(b - a) + a + 1;
		System.out.println("== "+ this.number +" ==");
	}
	
	public GuessNumber(int number) {
		/* wywolujemy metode getConfig(), abysmy wczytali ustawienia 
		 * gry i mogli uzywac i odwolywac sie po kluczach do odpowiednich ustawien */
		this.getConfig();
		/* konstruktor sparametryzowany pozwala nam na ustawienie liczby do zgadniecia przy tworzeniu instancji obiektu */
		this.number = number;
	}

	/* oraz gettery i settery dla pól prywatnych */
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String getName() {
		return name;
	}
	
	/* metoda wczytuj¹ca liczbê ca³kowit¹ od u¿ytkownika i zwracaj¹ca j¹ z zabezpieczeniem formatu */
	public int readNumber() {
		/* inicjalizujemy now¹ instacjê Scannera */
		Scanner sc = new Scanner(System.in);
		int ret;
		/* prosimy u¿ytkownika o podanie liczby ca³kowitej */
		System.out.println("Podaj liczbê ca³kowit¹: ");
		
		/* sprawdzamy czy podana liczba to int */
		while(!sc.hasNextInt()) {
			/* jesli nie, to informujemy o tym uzytkownika */
			System.out.println("B³¹d! Podaj liczbê ca³kowit¹: ");
			/* i pobieramy kolejn¹ wartoœæ */
			sc.next();
		}
		/* zwracamy pobran¹ wartoœæ ca³kowit¹ */
		ret = sc.nextInt();
		//sc.close();
		return ret;
	} 
	
	/* sprawdzamy czy wylosowana liczba jest taka sama jak przekazana jako argument */
	public boolean checkNumber(int number) {
		return this.number == number;
	}

	@Override
	public void run() {
		game();
	}

	@Override
	public void game() {
		/* zakladamy, ze uzytkownik podal liczbe -1 */
		int currentNumber = -1;
		
		/* dopoki uzytkownik nie poda '0' wykonuj: */
		while(currentNumber != 0) {
			/* do zmiennej currentNumber wczytaj liczbê z klawiatury */
			currentNumber = readNumber();
			/* je¿eli ta liczba odpowiada liczbie wylosowanej */
			if(checkNumber(currentNumber)) {
				/* wyswietl odpowiedni komunikat */
				System.out.println("Wygra³eœ!");
				break;
			} else {
				/* wyswietl odpowiedni komunikat */
				System.out.println("Przegra³eœ!");
			}
			/* wyswietl komunikat o zakonczeniu gry */
			System.out.println("\n0. Koniec gry");
		}
	}

	@Override
	public HashMap<String, String> getConfig() {
		/* inicjalizujemy HashMape do naszego pola conf */
		this.conf = new HashMap<String, String>();
		/* tworzymy tymczasowa zmienna tmp, ktora bedzie przetrzymywala klucz i wartosc */
		String[] tmp = new String[2];
		/* tworzymy tymczasowa zmienna, ktora bedzie przetrzymywala aktualnie odczytana linijke pliku konfiguracyjnego */
		String currentLine = "";
		/* deklarujemy plik z ustawieniami gry */
		File f = new File("src\\resources\\GuessNumber.ini");
		try {
			/* deklarujemy nowy Scanner */
			Scanner sc = new Scanner(f);
			/* dopoki sa linie w pliku (skaner ma skad czytac) */
			while(sc.hasNextLine()) {
				/* do zmiennej currentLine przypisujemy aktualnie odczytana linie z pliku */
				currentLine = sc.nextLine();
				/* sprawdzamy czy to co odczytalismy jest pustym ciagiem znakow */
				if(!currentLine.trim().equals("")) {
					/* jezeli NIE jest, to rozdzielamy odczytana linie z pliku po znaku '=' */
					tmp = currentLine.split("=");
					/* dodajemy do mapy  */
					this.conf.put(tmp[0], tmp[1]);
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return this.conf;
	}

	public void setConfig() {
		this.setConfig(this.conf);
	}
	
	@Override
	public void setConfig(HashMap<String, String> config) {
		Set<String> keys = config.keySet();
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File("src\\resources\\GuessNumber.ini")));
			for(String key: keys) {
				pw.println(key + "=" + config.get(key));
			}
			pw.close();
		} catch(FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	@Override
	public void addOrUpdateKey(String key, String value) {
		/* sprawdzamy czy podany klucz juz istnieje */
		if(this.conf.containsKey(key)) {
			this.conf.replace(key, value);
		} else {
			this.conf.put(key, value);
		}
	}

	@Override
	public void removeKey(String key) {
		this.conf.remove(key);
	}
	
	public String getValue(String key) {
		if(this.conf.containsKey(key)) {
			return this.conf.get(key);
		} else {
			return "0";
		}
	}

}
