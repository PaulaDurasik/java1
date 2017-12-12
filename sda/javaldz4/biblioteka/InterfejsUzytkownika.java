package com.sda.javaldz4.biblioteka;

import com.sda.javaldz4.dodatkowy.Narzedzia;

import java.time.LocalDate;
import java.util.Queue;
import java.util.Set;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
        Biblioteka b1 = new Biblioteka();
        Biblioteka b2 = new Biblioteka();
        dodajKsiazkiDoBibliotek(b1, b2);
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Horsman", 42, "Java Podstawa", "123456789", 945, Kategoria.IT, 1986);
        System.out.println(" Pokaż liste książek" + b1.pokzListeKsiazek() + "---------------");
        System.out.println("Unikalne tytuły:" + b1.zwrocUnikalnytytul() + "----------------");
        System.out.println("Pokaż Czytelników"+ b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Jan", "Kowalski", LocalDate.of(1988,05,23)));
        System.out.println("Pokaż czytelników2"+b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Anna", "Duda", LocalDate.of(1988,05,23)));
        System.out.println("Pokaż czytelników3"+b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Kamil", "Dziuda", LocalDate.of(1988,05,23)));
        b1.zapiszCzytelnika(javaPodstawy, new Osoba("Armin", "Von biurven", LocalDate.of(1988,05,23)));
        Ksiazka technikiZaawansowane=Narzedzia.utworzKsiazke("Cay", "Horstman", 45, "Java Technika Zawansowama", "1234566778", 945, Kategoria.IT, 2017);
        b1.zapiszCzytelnika(technikiZaawansowane, new Osoba("Jan", "Kowalski", LocalDate.of(1988,05,23)));
        b1.zapiszCzytelnika(technikiZaawansowane, new Osoba("Anna", "Duda", LocalDate.of(1988,05,23)));
        b1.zapiszCzytelnika(technikiZaawansowane, new Osoba("Paula", "D", LocalDate.of(1988,05,23)));
        //System.out.println("Wypożyczenie ksiązek przez Osobe"+ b1.wypozyczoneKsiazkiPrzezOsobe("Jan","Kowalski");
        System.out.println("Wypożyczenie ksiązek przez Osobe"+b1.zwrocKsiazkiPrzeczytanePrzezOsobe( new Osoba("Kamil", "Dziuda", LocalDate.of(1988,05,23))));




        Queue<Ksiazka> ksiazkiPoautrze = b1.zwrocListeKsiazekWgKryterium(Kryterium.ISBN, Porzadek.MALEJACO);
        while (!ksiazkiPoautrze.isEmpty()) {// dopóki sa jakies elementy wchodz do pętli i pobieraj książki
            Ksiazka ksiazka=ksiazkiPoautrze.poll();//kolejke pobiera poll; i go z niej wyrzuca;
            //System.out.println(ksiazkiPoautrze.poll());
            System.out.println("Czytelnicy ksiazki o tytule"+ ksiazka.getTytul()+ b1.pokazCzytelnikowWgKsiazki(ksiazka));
        }
        Set<Ksiazka> ksiazkiWB1 = b2.znajdzKsiazkepoFragmencieTytulu("Pan");
        System.out.println("Ksiazki WB1" + ksiazkiWB1);

    }


    private static void dodajKsiazkiDoBibliotek(Biblioteka b1, Biblioteka b2) {
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Horsman", 42, "Java Podstawa", "123456789", 945, Kategoria.IT, 1986);
        b1.dodajKsiazke(javaPodstawy);
        b1.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Horstman", 45, "Java Technika Zawansowama", "1234566778", 945, Kategoria.IT, 2017));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Pan Tadeusz", "12345677899", 300, Kategoria.EPOPEJA,1987));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Dan", "Brown", 55, "Inferno", "83545453454", 500, Kategoria.SCIFI, 1976));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Horstman", 45, "Java Technika Zawansowama", "1234566778", 944, Kategoria.IT, 1976));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Ray", "Horsman", 42, "Java Podstawa", "123456789", 945, Kategoria.IT, 1975));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("J.K", "Rowling", 30, "Harry Potter", "123456677889", 300, Kategoria.BAJKA, 18364));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("George", "Martin", 50, "Gra o Tron", "6767676767676", 600, Kategoria.DRAMAT, 1964));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Juzin", "Z Bazin", 70, "Ma grabe", "7676859409484", 50, Kategoria.SCIFI,1836));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Tove", "Janson", 120, "Muminki", "8475765859590595", 150, Kategoria.BAJKA,1836));
    }


}

