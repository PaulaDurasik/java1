public interface Interfejsy {

    //kazdy interfac powinien być w  osobnym pliku
    public static interface Witacz {// normalnie musumy dawac slowa static wszystko robimy w jwdnwj klasie

        void witaj(String imie);// metoda nie ma implementacji nic nie zwraca ma jednej parametr
    }

    public  static interface Zegnacz{
        void zegnaj(String imie);
    }
        public static class ZwyklyWitacz implements Witacz {
        public void witaj(String imie) {
            System.out.println("Witaj" + imie);

        }
    }
    public static class ZwyklyZegnacz implements Zegnacz {
        public void zegnaj (String imie) {
            System.out.println("Zegnaj" + imie);

        }

    }



        public static class DekoracyjnyWitacz implements Witacz{
            public void witaj (String imie){
                System.out.println(".:Witaj:."+imie+":.");
            }
        }
    public static class DekoracyjnyZegnacz implements Zegnacz{
        public void zegnaj (String imie){
            System.out.println(".:Zegnaj:."+imie+":.");
        }
    }

    public static class WitaczZegnacz implements Witacz, Zegnacz{

        @Override
        public void witaj(String imie) {
            System.out.println("Witaj"+ imie);

        }

        @Override
        public void zegnaj(String imie) {
            System.out.println("żegnaj"+ imie);

        }
    }

        public static void przywitaj (Witacz witacz){
            witacz.witaj("Helgo");
        }


        public static void main(String[] args) {
            // Witacz w1=new Witacz(); nie możmy stwprzyc takiej instancji mposiadając tylko interfejs dlatego twprzymy klasę ktora implementuje
            //interface wyitacz, nie można utowrzyc Obiektu
            Witacz w1 = new ZwyklyWitacz();
            w1.witaj("Baltazarze");
            w1=new DekoracyjnyWitacz();
            w1.witaj("Baltazarze");
            //kiedy stosuje interfejsy stosuje się instatncje klasy

            przywitaj(new ZwyklyWitacz());
            przywitaj((Witacz) new ZwyklyZegnacz());


        }
    }



