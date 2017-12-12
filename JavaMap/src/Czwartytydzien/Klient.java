package Czwartytydzien;

public class Klient extends Bank {
    String nazwe;
    Double StankontaKlienta;
    private Klient klienci;
    int wezpozyczke;
    int zaluzLokate;
    int wplata;
    int wyplata;

    public Klient(){};

    public Klient (String nazwe, Double StanKontaKlienta, int wezpozyczke, int zaluzLokate, int wplata, int wyplata){
        this.nazwe=nazwe;
        this.StankontaKlienta=StanKontaKlienta;
        this.wezpozyczke=wezpozyczke;
        this.zaluzLokate=zaluzLokate;
        this.wplata=wplata;
        this.wyplata=wyplata;
    }
    public double getwezpozyczke() {
            return StankontaKlienta+wezpozyczke;
        }

    public Double getzaluzLokate() {
        return (StankontaKlienta - zaluzLokate);
    }

    public Double getwyplata() {
        for (Klient klient : klienci) {
            if (StankontaKlienta > 0) {
                return (StankontaKlienta - wyplata);
            } else {
                System.out.println("Nie ma pieniedzy");
            }
            return StankontaKlienta;
        }
    }


    public Double getwplata() {
        return (StankontaKlienta+wyplata);
    }

    public Double getStankontaKlienta() {
        return StankontaKlienta+wezpozyczke-zaluzLokate+wplata-wyplata;
    }
}





