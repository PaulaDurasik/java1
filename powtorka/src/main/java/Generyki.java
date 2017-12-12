import java.util.Objects;

public class Generyki {
    //
    public static class Pojemnik{
        String wartości;
        public Pojemnik(String wartości){
            this.wartości=wartości;
        }
        //public String getNazwaPola
        public String wezWartości() {
            return wartości;

        }

        public boolean porównaj(Pojemnik tenDrugi){
            return Objects.equals(wezWartości(),tenDrugi.wezWartości());

        }
    }
    public static void main(String[] args) {
        Pojemnik pl=new Pojemnik("Artur");
        Pojemnik p2=new Pojemnik("Marcin");
        Pojemnik p3=new Pojemnik("Zofia");
        Pojemnik p4=new Pojemnik("Zbigniew");


    }
}
