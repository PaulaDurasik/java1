package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*Main m = new Main();
		try {
			String s = m.sendPOST();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		HTTPConnector hc = new HTTPConnector();
		HashMap<String, String> map = new HashMap<>();
		map.put("klucz1", "v2");
		map.put("zxcvbn", "qwerty");
		System.out.println(hc.convertMapToString(map));
	}

	public String sendGET() throws IOException {
		/* definiujemy adres polaczenia (hosta) */
		String url = "http://palo.ferajna.org/sda/wojciu/json.php?login=test";
		/* definiujemy przegladarke (user-agent) */
		String ua = "Pawel/1.0";
		/* definiujemy nowy obiekt typu URL */
		URL obj = new URL(url);
		/* definiujemy polaczenie */
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		/* opcjonalnie */
		con.setRequestMethod("GET");

		/* definiujemy naglowek - dodajemy user-agenta */
		con.setRequestProperty("User-Agent", ua);

		/* pobieramy kod zwrotki (http response code) */
		int responseCode = con.getResponseCode();
		/* definiujemy zmienne dla aktualnej lini oraz calego pliku */
		String ret = "", currentLine = "";
		if (responseCode == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while((currentLine = br.readLine()) != null) {
				ret += currentLine;
			}
			/* zamykamy readera */
			br.close();
		} else {
			System.out.println("Code: " + responseCode);
		}
		//System.out.println(ret);
		/* zwracamy odpowiedz */
		return ret;
	}
	
	public String sendPOST() throws IOException {
		String url = "http://palo.ferajna.org/sda/wojciu/json.php";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		String ua = "Pawel/1.1";
		
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", ua);
		
		/* tylko dla POST, przesylanie danych w sposob niejawny */
		String myParams = "login=test&haslo=qwerty";
		con.setDoOutput(true);
		DataOutputStream dos = new DataOutputStream( con.getOutputStream() );
		dos.writeBytes(myParams);
		dos.flush();
		dos.close();
		
		String ret = "";
		int responseCode = con.getResponseCode();
		if(responseCode == 200) {
			Scanner sc = new Scanner(new InputStreamReader(con.getInputStream()));
			
			while(sc.hasNextLine()) {
				ret += sc.nextLine();
			}
			sc.close();
		}
		
		return ret;
	}
	
}
