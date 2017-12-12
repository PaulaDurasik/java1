package com.sda.javaldz4.ksiegowosc;

import java.util.*;
import java.util.stream.Collectors;

public class Inteferjs {
    public static void main(String[] args) {
        String sciezkaDoPliku = "C:/Users/Bartłomiej/Desktop/zadaniedodtkoweBank/baza.csv";
        List <Map <String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        //System.out.println(wierszePliku.get(0));
        List <Persona> osoby = NarzedziaCsv.zamienMapenaPersone(wierszePliku);
        //System.out.println(osoby.get(0));
        // Wszytkie osoby o imieniu Adam

        List <Persona> adamowie = osoby.stream().filter(persona -> persona.getImie().equals("Dariusz")).collect(Collectors.toList());
        //System.out.println(adamowie);
        //wyswietlListe(adamowie);

        List <String> nazwiska = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toList());
        //System.out.println(nazwiska);
        Set <String> nazwiskaUnikalne = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toSet());
        //System.out.println(nazwiska);


        //osoby starsz niż 35 lat //nazwiska na literę S
        List <Persona> starszeNiz = osoby.stream().filter(persona -> {
            if (persona.getWiek() > 35 && persona.getNazwisko().charAt(0) == 'S') {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        //System.out.println(starszeNiz);

        //osoby w wieku produkcyjnym

        List <Persona> wWiekuProdukcyjnym = osoby.stream().filter((Persona persona) -> {
            if (persona.getPlec().equals(Plec.KOBIETA)) {
                return persona.getWiek() >= 18 && persona.getWiek() <= 59;
            } else {
                return persona.getWiek() >= 18 && persona.getWiek() <= 64;
            }
        }).collect(Collectors.toList());
        //wyswietlListe(wWiekuProdukcyjnym);

        //osoby mieskzjaące w Gdansk i w warszawie

        List <Persona> mieszkajaWGdanskuLubWarszawie = osoby.stream().filter(persona -> {
            if (persona.getMiasto().equals("Warszawa")) {
                return true;
            } else if (persona.getMiasto().equals("Gdańsk")) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        //wyswietlListe(mieszkajaWGdanskuLubWarszawie);

        //osobe urodzone w maju
        List <Persona> urodzonewMaju = osoby.stream().filter(persona -> {
            if (persona.getDataUrodzenia().getMonthValue() == 5) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        // System.out.println(urodzonewMaju);
        //osoby ktorych kod pocztowy zaczyna się od cyfry9
        List <Persona> kodPocztowyod9 = osoby.stream().filter(persona -> {
            if (persona.getKodpocztowy().startsWith("9")) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        //wyswietlListe(kodPocztowyod9);
        //lista unikalnych zawodoów
        Set <String> listaUnikalnychZawodow = osoby.stream().map(persona -> persona.getZawod()).collect(Collectors.toSet());
        //System.out.println(listaUnikalnychZawodow);

        //wyswietl pierwsz 20 osob z najwyzszymi dochodami
        List <Persona> listaOsobzDochodami = osoby.stream().sorted((o1, o2) -> o2.getZarobki().compareTo(o2.getZarobki())).limit(20).collect(Collectors.toList());
        wyswietlListe(listaOsobzDochodami);

        List <Persona> copy = new ArrayList <>(osoby);
        Collections.sort(copy, new Comparator <Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getZarobki().compareTo(o1.getZarobki());
            }
        });
        List<Persona>burzujeponowemu=copy.subList(0,20);
        wyswietlListe(burzujeponowemu);

        OptionalDouble sredniaZarkow=osoby.stream().filter(persona -> {
            if(persona.getWiek()>20&&persona.getWiek()<30){
                return true;
            } else {
                return false;
            }
        }).mapToInt(persona-> persona.getZarobki()).average();
        System.out.println("Srednia zarobków"+sredniaZarkow);// żeby wyciągnąc wartość is present używamy

       long ilosckobiet=osoby.stream().filter(persona -> {
            if(persona.getPlec().equals(Plec.KOBIETA)){
                return true;
            }else{ return false;}
        }).count();

        System.out.println(ilosckobiet);}

        //int[] ilosckobietimezczyzn=osoby.stream().map(persona -> {
          //  if(persona.getPlec().equals(Plec.KOBIETA)){
             //   return new int []{1,0};
            ////} else{ return new int[]{0,1};}
//
       //// }).reduce(new int[2],(a,b)->{
           // a[0]=a[0]+b[0];//ilość kobiet
            ////a[1]=a[1]+b[1];//ilość meżczyzn
           //// return a;

        //}).

        //System.out.println(ilosckobietimezczyzn[0]+" "+ilosckobietimezczyzn[1])

        public static void listaOsobwMiescie(List<Persona> osoby){
            List<Persona> list=new ArrayList <>();


    }



       ////// long pracujacychWMiescie=osoby.stream().filter(persona -> {
           //// if(persona.getMiasto().equals()){
              //  return true;
           // } else {return false;}
        //}).count();
       // System.out.println();;






    static void wyswietlListe(List <Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona);
        }
    }
}

