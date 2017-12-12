package com.sda.javaldz4.biblioteka;

public class Autor {
    private String imie;
    private String nazwisko;
    private Integer wiek;

    public Autor(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (!imie.equals(autor.wiek)) return false;
        return wiek.equals(autor.wiek);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + nazwisko.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return nazwisko+" "+imie;
    }


}
