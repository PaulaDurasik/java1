package com.sda.javaldz4.ksiegowosc;

import java.time.LocalDate;


public class Persona {
    private String imie;
    private String nazwisko;
    private Integer wiek;
    private String miasto;
    private String ulica;
    private String kodpocztowy;
    private Plec plec;
    private String zawod;
    LocalDate dataUrodzenia;
    private Integer zarobki;

    public Persona( ) {

    }

    @Override
    public String toString() {
        return "Persona{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", kodpocztowy='" + kodpocztowy + '\'' +
                ", plec=" + plec +
                ", zawod='" + zawod + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", zarobki=" + zarobki +
                '}';
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

    public String getMiasto() {
        return miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public String getKodpocztowy() {
        return kodpocztowy;
    }

    public Plec getPlec() {
        return plec;
    }

    public String getZawod() {
        return zawod;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Integer getZarobki() {
        return zarobki;
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

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setKodpocztowy(String kodpocztowy) {
        this.kodpocztowy = kodpocztowy;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setZarobki(Integer zarobki) {
        this.zarobki = zarobki;
    }
    
}
