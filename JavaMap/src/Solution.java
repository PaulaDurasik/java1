import java.util.*;

class Solution {
    public static void main(String[] argh) {
        String[] names = {"uncle sam", "tom", "harry"};
        int[] numbers = {99912222, 11122222, 12299933};
        Map<String, Integer> mapa = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            mapa.put(names[i], numbers[i]);
        }
        System.out.println(mapa);

        String a = "tom";
        if (mapa.containsKey(a)) {
            System.out.println("znaleziono imi�"+ a +"o numerze"+ mapa.get(a));
        } else {
            System.out.println("nie znaleziono");
        }
        //put( Key, Value)
        // dodaj do mapy nazwy oraz odpowiadaj�ce im numery
        if (mapa.containsKey("tom")) {

            String[] query = {"uncle sam", "uncle tom", "harry"};

            // sprawd� czy w mapie wyst�puj� powy�sze warto�ci,
            // je�li tak wypisz nazw� oraz numer np. tom = 11122222
            // je�li nie - wy�wietl "nie znaleziono"

        }
    }
}