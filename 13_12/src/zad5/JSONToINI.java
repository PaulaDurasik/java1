package zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONToINI {
	/* deklarujemy sciezke do pliku */
	private final String path = "src\\resources\\";
	
	/* metoda, odczytujaca dane z pliku i zwracajaca je jako string */
	public String getJSONFromFile(String filename) {
		/* deklarujemy pusty ciag znakow */
		String myJSON = "";
		/* deklarujemy obiekt przetrzymujacy nasz plik (handler) */
		File f = new File(this.path + filename);
		try {
			/* definiujemy nowy skaner */
			Scanner sc = new Scanner(f);
			/* czytmy wszystkie linie */
			while(sc.hasNextLine()) {
				/* aktualnie przeczytana linie dodajemy do zmiennej, ktora bedziemy zwracac */
				myJSON += sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/* zwracamy przeczytany plik */
		return myJSON;
	}
	/* metoda sluzaca do drukowania poszczegolnych kluczy */
	public void printKeys(String strJSON) {
		/* tworzymy obiekt parsera */
		JSONParser jp = new JSONParser();
		try {
			/* próbujemy sparsowac nasz odczytany plik do obiektu */
			Object o = jp.parse(strJSON);
			/* podejmujemy decyzje jakiego typu jest to obiekt (JSONArray, JSONObject, inny) */
			int type = getObjectType(o);
			switch (type) {
				/* jesli JSONArray */
				case 0:
					/* przerzutuj obiekt na typ JSONArray */
					JSONArray ja = (JSONArray) o;
					/* wywolaj metode rekursywnie drukujaca tablice JSON */
					printRJSONArray(ja);
					break;
				/* jesli JSONObject */
				case 1:
					/* przerzutuj obiekt na typ JSONObject */
					JSONObject oo = (JSONObject) o;
					/* wywolaj metode rekursywnie drukujaca obiekt JSON */
					printRJSONObject(oo);
					break;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/* metoda podejmujaca decyzje, jakiego typu mamy obiekt */
	private int getObjectType(Object o) {
		/* zakladamy, ze obiekt jest innego typu niz JSONObject lub JSONArray */
		int ret = -1;
		/* sprawdzamy, czy obiekt jest instancja obiektu JSONObject */
		if (o instanceof JSONObject) {
			/* jesli tak ustawimy odpowiednia flage */
			ret = 1;
		/* sprawdzamy, czy obiekt jest instancja obiektu JSONArray */
		} else if (o instanceof JSONArray) {
			/* jesli tak ustawimy odpowiednia flage */
			ret = 0;
		}
		/* zwracamy podjeta decyzje */
		return ret;
	}
	
	/* metoda drukujaca obiekt JSON rekursywnie */
	private void printRJSONObject(JSONObject jo) {
		/* deklarujemy zbior kluczy z obiektu JSON przekazanego jako parametr */
		Set s = jo.keySet();
		/* iterujemy sie przez wszystkie klucze */
		for(Object x: s) {
			/* przypisujemy wartosc z klucza do nowej instancji obiektu */
			Object z = jo.get(x.toString());
			/* sprawdzamy typ obiektu */
			if(!(z instanceof JSONObject || z instanceof JSONArray)) {
				/* jezeli nie jest on tablica lub obiektem JSON to go drukujemy do konsoli */
				System.out.println(x.toString() + "=" + z);
			/* w przeciwnym wypadku (jezeli jest obiektem JSON lub tablica JSON) */
			} else {
				/* sprawdzamy czy jestesmy instancja tblicy JSON */
				if(z instanceof JSONArray) {
					/* jezeli tak, to: rzutujemy nasz obiekt na typ JSONArray */
					JSONArray source = (JSONArray) z;
					/*  tworzymy tymczasowa instancje obiekt uJSONArray, do ktorego przepiszemy
					 * tylko i wylacznie dane, ktore nie sa obiektami lub tablicami JSON
					 * (przepisujemy tylko i wylacznie pojedyncze wartosci roznego typu) */
					JSONArray jaa = new JSONArray();
					/* iterujemy sie przez nasza tablice JSON */
					for(int i = 0; i < source.size(); i++) {
						/* pobieramy aktualnie iterowany element do obiektu */
						Object currentListItem = source.get(i);
						/* jezeli nie jest on obiektem lub talbica JSON */
						if(getObjectType(currentListItem) == -1) {
							/* to dodajemy go do tymczasowej tablicy */
							jaa.add(currentListItem);
						}
					}
					/* drukujemy tablice tymczasowa, ktora jest pozbawiona obiektow oraz tablic typu JSON */
					System.out.println(x.toString() + "=" + jaa);
				}
			}
			
			/* podejmujemy decyzje odnosnie typu naszego obiektu bazowego */
			int type = getObjectType(z);
			
			/* sprawdzamy typ obiektu */
			switch (type) {
				/* jezeli tablica  */
				case 0:
					/* rzutujemy na tablice */
					JSONArray ja = (JSONArray) z;
					/* wowolujemy metode drukujaca tablice rekurencyjnie */
					printRJSONArray(ja);
					break;
				case 1:
					/* rzutujemy na obiekt */
					JSONObject oo = (JSONObject) z;
					/* wowolujemy metode drukujaca obiekt rekurencyjnie */
					printRJSONObject(oo);
					break;
			}
		}
	}
	
	/* metoda drukujaca rekurencyjnie tablice  */
	private void printRJSONArray(JSONArray ja) {
		/* iterujemy sie poprzez tablice */
		for(int i = 0; i < ja.size(); i++) {
			/* pobieramy kolejne wartosci  */
			Object o = ja.get(i);
			/* i sprawdzamy jakiego sa typu */
			int type = getObjectType(o);
			switch (type) {
				/* jezeli tablica  */
				case 0:
					/* rzutujemy na tablice */
					JSONArray a = (JSONArray) o;
					/* wowolujemy metode drukujaca tablice rekurencyjnie */
					printRJSONArray(a);
					break;
				/* jezeli obiekt  */
				case 1:
					/* rzutujemy na obiekt */
					JSONObject oo = (JSONObject) o;
					/* wowolujemy metode drukujaca obiekt rekurencyjnie */
					printRJSONObject(oo);
					break;
			}
		}
	}
}
