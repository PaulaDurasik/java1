package com.sda.javaldz4.biblioteka;

import java.util.*;

public class Biblioteka {
    private List <Ksiazka> listaKsiazek;
    private Map<Ksiazka, List<Osoba>> rejestrCzytelnikow;
    public Biblioteka(){
        this.listaKsiazek=new ArrayList <>();
        this.rejestrCzytelnikow=new HashMap <>();
    }


    public void dodajKsiazke(Ksiazka ksiazka) {
        if (ksiazka != null) {
            listaKsiazek.add(ksiazka);
        }
    }
    public void zapiszCzytelnika(Ksiazka wypozyczonaKsiazka, Osoba czytelnik) {// sprawdzamy czy rejest zawiera książkę
        if (rejestrCzytelnikow.containsKey(wypozyczonaKsiazka)) {
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);

        } else {
            rejestrCzytelnikow.put(wypozyczonaKsiazka, new ArrayList <>());// dodajemy nową listę czytelników

            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);//bierzemy książkę i dodajemy czytelnika
        }
    }

    public List<String> pokazCzytelnikowWgKsiazki(Ksiazka ksiazka) {// chcemy wywołać liste stringów przyjmujac parametr ksiazka ksiazka
        List <String> wyniki = new ArrayList <>();
        if (rejestrCzytelnikow.containsKey(ksiazka)) {
            List <Osoba> osobyZRejestru = rejestrCzytelnikow.get(ksiazka);//pobieramy z rejestru cztelnikow ksiazke
            for (Osoba osoba : osobyZRejestru) {// pobieramy ososbę z listy wybieramy jej imie i nazwisko i wrzucamy do listy wynikow
                wyniki.add(osoba.getImie() + " " + osoba.getNazwisko());
            }
            return wyniki;
        } else {
            return wyniki;
        }
    }

   public List <Ksiazka> wypozyczoneKsiazkiPrzezOsobe(Osoba osoba) {
       List <Ksiazka> wyniki = new ArrayList <>();
       for (Ksiazka ksiazka : rejestrCzytelnikow.keySet()) {//musimy przeiterować przez wszystkie klucze
           List <Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
           for (int i = 0; i < czytelnicy.size(); i++) {//sprawdzamy czy kolejno wszyscynczytelnicy czy nie nazywa się jak kowalski

               if (czytelnicy.get(i).equals(osoba)) ;
           }
           {
               wyniki.add(ksiazka);
               break;
           }

       }
      return wyniki;
   }

   public Map<Ksiazka, Integer> zwrocKsiazkiPrzeczytanePrzezOsobe(Osoba osoba) {
       Map <Ksiazka, Integer> wyniki = new HashMap <>();
       for (Ksiazka ksiazka : rejestrCzytelnikow.keySet()) {
           List <Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
           for (Osoba czytelnik : czytelnicy) {
               if (czytelnik.equals(osoba)) {
                   if (wyniki.containsKey(ksiazka)) {
                       Integer poprzedniaWartosc = wyniki.get(ksiazka);
                       wyniki.put(ksiazka, poprzedniaWartosc + 1);
                   }
               } else {
                   wyniki.put(ksiazka, 1);
               }
           }

       }
       return wyniki;

   }

    public List <String> pokzListeKsiazek() {
        List <String> wynik = new ArrayList <>();
        for (Ksiazka ksiazka : listaKsiazek) {
            String opis = String.format("%s,%s.%s", ksiazka.getAutor().toString(), ksiazka.getTytul(), ksiazka.getKategoria().getCzytelnaNazwa());
            wynik.add(opis);
        }
        return wynik;
    }

    public Queue <Ksiazka> zwrocListeKsiazekWgKryterium(Kryterium kryterium, Porzadek porzadek) {
        PorownywarkaKsiazek porownywarka = new PorownywarkaKsiazek(kryterium, porzadek);
        Queue <Ksiazka> wynik = new PriorityQueue <>(porownywarka);// przeszukuje tablice
        wynik.addAll(listaKsiazek);
        return wynik;


    }


    public Set <Ksiazka> zwrocUnikalnytytul() {
        Set <Ksiazka> wynik = new HashSet <>();
        wynik.addAll(listaKsiazek);
        return wynik;
    }

    public Set <Ksiazka> znajdzKsiazkepoFragmencieTytulu(String fragment) {
        Set <Ksiazka> wynik = new TreeSet <>();
        for (Ksiazka ksiazka : listaKsiazek) {
            if (ksiazka.getTytul().contains(fragment)) {
                wynik.add(ksiazka);
            }

        }
        return wynik;
    }
}




