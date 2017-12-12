package Czwartytydzien;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Bank {
    Double StankontaBank;
    String NazwaBanku;
    private Klient klienci;
    int Wezpozyczke;
    int ZaluzLokate;
    int Wplata;
    int Wyplata;

    public Bank() {
    }

    public Bank(Double StankontaBank, String NazwaBanku, int Wezpozyczke, int ZaluzLokate, int Wplata, int Wyplata) {
        this.StankontaBank = StankontaBank;
        this.NazwaBanku = NazwaBanku;
        this.Wezpozyczke=Wezpozyczke;
        this.ZaluzLokate=ZaluzLokate;
        this.Wplata=Wplata;
        this.Wyplata=Wyplata;

    }


    public double getWezpozyczke() {
        if (StankontaBank > 0) {
            return (StankontaBank - Wezpozyczke);

        } else {
            System.out.println("Nie ma pieniedzy");
        }
        return StankontaBank;
    }

    public Double getZaluzLokate() {
        return (StankontaBank + ZaluzLokate);
    }

    public Double getWyplata() {
        if (StankontaBank > 0) {
            return (StankontaBank - Wyplata);
        } else {
            System.out.println("Nie ma pieniedzy");
        }
     return StankontaBank;
}


    public Double getWplata() {
        return (StankontaBank + Wplata);
    }

    public Double getStankontaBank() {
        return StankontaBank- Wyplata+Wplata-Wezpozyczke+ZaluzLokate ;
    }
    }

