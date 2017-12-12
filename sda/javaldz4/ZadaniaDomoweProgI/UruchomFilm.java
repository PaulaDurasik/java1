package com.sda.javaldz4.ZadaniaDomoweProgI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UruchomFilm {
    public static void main(String[] args) {
        List <String> filmy = new ArrayList <>();
        filmy.add("Przeminęło z Wiatrem");
        filmy.add(1, "Ostatnia wieczerza");
        filmy.add(2, "A jak nie my to kto");
        filmy.add(3, " Co zlego to nie ja");
        filmy.add(4, "Spiąca królewna");
        filmy.add(5, "Czerwony kaputek");
        filmy.add(6, "Szczęki 3");
        filmy.add(7, "American Horror Story");
        filmy.add(8, "Harry Potter");
        filmy.add(9, "Strazak Sam");
        filmy.add(10, "Jas Fasola");
        filmy.add(11, "Gra o Tron");
        filmy.add(12, "Texas Party");
        filmy.add(13, "Dom tysiąca ciał");
        filmy.add(14, "Jas i Małgosia");
        filmy.add(15, "Na dobre i na złe");
        filmy.add(16, "Tylko mnie kochaj");
        filmy.add(17, "Troja");
        filmy.add(18, "Smok Wawelski");
        filmy.add(19, "Osma mila");

        //Filmy za zynające się na litere A

        List <Object> tytuluNaA = filmy.stream().filter(film -> {
            if (film.charAt(0) == 'A') {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(tytuluNaA);

//Listę tytułów, które mają dwa słowa w nazwie
        List <Object> dwaSlowaWNazwie = filmy.stream().filter(film -> {
            if (film.contentEquals(" ")) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(dwaSlowaWNazwie);


        //listę tytułów, które mają więcej niż 5 znaków

        List <Object> wiecejNizPiecZnakow = filmy.stream().filter(film -> {
            if (film.length() > 5) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(wiecejNizPiecZnakow);

        // tytuł o najdłuższej nazwie

        List <Object> najdluzszaNazwa = filmy.stream().map(s -> s.trim()).collect(Collectors.toList());
        System.out.println(najdluzszaNazwa);
    }
}