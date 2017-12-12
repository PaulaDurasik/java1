package Czwartytydzien;

public class Wiatr {
    private double predkosc;

    public Wiatr() {
    }

    ;

    public Wiatr(double predkosc) {
        this.predkosc = predkosc;
    }

    public double getPredkosc() {
        return predkosc;
    }

    public double getMile() {
        return predkosc / 0.621371192;
    }

    public double getWezly() {
        return predkosc / 1.852;
    }

    public String tekst() {
        String odp = "";
        if (predkosc < 2) {
            odp = "lekki wiatr";
        } else if (predkosc > 120) {
            odp = "huragan";
        } else odp = "normalny";
        return odp;
    }

    @Override
    public String toString() {
        return tekst();
    }
}

