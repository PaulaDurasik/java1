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
            System.out.println("znaleziono imiê"+ a +"o numerze"+ mapa.get(a));
        } else {
            System.out.println("nie znaleziono");
        }
        //put( Key, Value)
        // dodaj do mapy nazwy oraz odpowiadaj¹ce im numery
        if (mapa.containsKey("tom")) {

            String[] query = {"uncle sam", "uncle tom", "harry"};

            // sprawdŸ czy w mapie wystêpuj¹ powy¿sze wartoœci,
            // jeœli tak wypisz nazwê oraz numer np. tom = 11122222
            // jeœli nie - wyœwietl "nie znaleziono"

        }
    }
}