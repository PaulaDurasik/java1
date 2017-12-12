package com.sda.javaldz4.biblioteka;

import java.time.LocalDate;

public class Osoba {
    private String imie;
    private  String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (imie != null ? !imie.equals(osoba.imie) : osoba.imie != null) return false;
        return nazwisko != null ? nazwisko.equals(osoba.nazwisko) : osoba.nazwisko == null;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }
}
