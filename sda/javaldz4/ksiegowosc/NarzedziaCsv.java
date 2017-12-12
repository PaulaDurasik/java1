package com.sda.javaldz4.ksiegowosc;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NarzedziaCsv {
public static List<Map<String,Object>> wczytajCsvZPliku(String sciezkaDoPliku) {
    List<Map<String, Object>> wyniki = new ArrayList <>();
    try {
        BufferedReader reader = new BufferedReader(new FileReader(sciezkaDoPliku));
        String linia=reader.readLine();
        while(linia != null) {
            Map <String, Object> wiersz = new HashMap <>();
            String[] wierszTablica = linia.split(";");
            if(wierszTablica.length<11){
                linia=reader.readLine();
                continue;
            }
            wiersz.put("Plec", wierszTablica[0]);
            wiersz.put("Imię", wierszTablica[1]);
            wiersz.put("Nazwisko", wierszTablica[2]);
            wiersz.put("Miasto", wierszTablica[3]);
            wiersz.put("Ulica", wierszTablica[4]);
            wiersz.put("KodPocztowy", wierszTablica[5]);
            wiersz.put("Wiek", wierszTablica[8]);
            wiersz.put("DataUrodzenia", wierszTablica[9]);
            wiersz.put("Zawód", wierszTablica[10]);
            wiersz.put("Zarobki",wierszTablica[11]);
            wyniki.add(wiersz);
            linia = reader.readLine();
        }
        reader.close();//zamyka strumień danych
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return wyniki;

}

public static List<Persona> zamienMapenaPersone(List<Map<String,Object>> wiersze) {
    List <Persona> persony = new ArrayList <>();
    for (int i = 1; i < wiersze.size(); i++) {
        Map <String, Object> wiersz = wiersze.get(i);
        Persona persona = new Persona();
        persona.setImie((String) wiersz.get("Imię"));
        persona.setNazwisko((String) wiersz.get("Nazwisko"));
        persona.setKodpocztowy((String) wiersz.get("KodPocztowy"));
        persona.setMiasto((String) wiersz.get("Miasto"));
        persona.setUlica((String) wiersz.get("Ulica"));
        persona.setZawod((String) wiersz.get("Zawód"));
        Integer wiek = Integer.parseInt((String) wiersz.get("Wiek"));
        persona.setWiek(wiek);
        Integer zarobki=Integer.parseInt((String) wiersz.get("Zarobki"));
        persona.setZarobki(zarobki);
        String plec = ((String) wiersz.get("Plec"));
        if (plec.equals("male")) {
            persona.setPlec(Plec.MEZCZYZNA);
        } else {
            persona.setPlec(Plec.KOBIETA);
        }
        String dataUrodzenia = (String) wiersz.get("DataUrodzenia");
dataUrodzenia=dataUrodzenia.replaceAll("\\.","/"); //znakiem \\. oznaczamy że chodzi nam o kropkę a nie o dowolny znak
        String[] data = dataUrodzenia.split("/");
        if (data.length == 3) {
            Integer dzien = Integer.parseInt(data[1]);
            Integer miesiac = Integer.parseInt(data[0]);
            Integer rok = Integer.parseInt(data[2]);
            persona.setDataUrodzenia(LocalDate.of(rok, miesiac, dzien));
        }
        persony.add(persona);
    }
    return persony;
}
}
