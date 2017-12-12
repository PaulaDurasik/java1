package com.sda.streamy;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyCwiczenia {
    public static void main(String[] args) {

        List <Integer> lista = new ArrayList <>();
        for (int i = 0; i < 100; i++) {
            lista.add(i + 1);
        }
        //Wszystkie liczby podzielne przez dwa
        List <Integer> podzielnePrzez2 = lista.stream().filter(new Predicate <Integer>() {//filtr
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());
        //System.out.println(podzielnePrzez2);
        //
        List <Integer> podzielnePrzez2PlusLambda = lista.stream().filter(liczba -> liczba % 2 == 0).collect(Collectors.toList());
        // System.out.println(podzielnePrzez2PlusLambda);

        List <Integer> pdzielnePrzez3iwiekszeod20 = lista.stream().filter(liczba -> (liczba % 3 == 0) && (liczba > 20)).collect(Collectors.toList());
        //System.out.println(pdzielnePrzez3iwiekszeod20);

        List <Integer> wynik1 = lista.stream().filter(liczba -> {
                    if (liczba < 51) {
                        return liczba % 2 == 0;
                    } else {
                        return liczba % 3 == 0;
                    }
                }
        ).collect(Collectors.toList());
        // System.out.println(wynik1);
        // System.out.println(lista);


        List <Integer> wynik2 = lista.stream().filter(liczba -> {
                    if (liczba <= 20) {
                        return (liczba % 3 == 0) && (liczba % 7 == 0);
                    } else if ((liczba >= 20) && (liczba <= 40)) {
                        return ((liczba % 2 == 0) && (liczba % 3 == 0));
                    } else if ((liczba >= 40) && (liczba <= 100)) {
                        return ((liczba % 4 == 0) && (liczba % 6 == 0));
                    }
            return false;
                }
        ).collect(Collectors.toList());
        // System.out.println(wynik2);


        List <Integer> wieksze3Razy = lista.stream().map(liczba -> liczba * 3).collect(Collectors.toList());
        //System.out.println(wieksze3Razy);

        List <Integer> wynik3 = lista.stream().map(liczba -> {
                    if ((liczba) > 0 && (liczba <= 20)) {
                        return ((liczba * 3) + 2);
                    } else if ((liczba > 21) && (liczba < 40)) {
                        return ((liczba * 5) - 50);
                    } else if ((liczba > 41) && (liczba < 100)) {
                        return (liczba * liczba);
                    }
                    return liczba;
                }
        ).filter(liczba -> liczba % 4 == 0).collect(Collectors.toList());
        // System.out.println(wynik3);

        Random random = new Random();
        //przemnożyć przez random.nextInt(100), znajdzcie najwieksza liczbe,
        //random, zwroc srednią z tego sltrumienia
        //random, znajdz pierwsza liczbe w zbiorze pierwsza liczbe podzielna przez 2

//1
        Integer max = lista.stream().mapToInt(liczba -> liczba * random.nextInt(100)).max().getAsInt();

        System.out.println(max);

        OptionalInt max2 = lista.stream().mapToInt(liczba -> liczba * random.nextInt(100)).max();
        if (max2.isPresent()) {
            System.out.println(max2.getAsInt());
        } else {
            System.out.println("zbior jest pusty");

        }

        OptionalDouble srednia=lista.stream().mapToInt(liczba->liczba*random.nextInt(100)).average();
        if(srednia.isPresent()){
            System.out.println(srednia.getAsDouble());
        }else {
            System.out.println("zbior jest pusty");
        }
        System.out.println("Srednia"+srednia);

        Optional<Integer> najwieksza= lista.stream().map(liczba->liczba*random.nextInt(100)).filter(liczba->liczba%2==0).
                findFirst();
        System.out.println(najwieksza);
        if (najwieksza.isPresent()){
            System.out.println(najwieksza.get());
        } else {
            System.out.println("Nie zlaleziono wyniku");
        }



    }

}
