package Czwartytydzien;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class UruchomBank extends Klient {
    public static void main(String[] args){

        Klient klient=new Klient("paula", (double)2500,1000,0,0,0);
        Klient klient1=new Klient("Zdzisiek",(double)7000,2000, 0,0,0 );
        Bank bank=new Bank((double)1000000, "multi", 0,0,0,0);
        Klient [] klienci= {klient, klient1};

        //Klient bierze pożyczkę
        int k=0;
        while(k<klienci.lengt) {
            if (klienci.wezpozyczke > 0) {
                int pozyczka = klienci[k].wezpozyczke;
                bank.Wezpozyczke = pozyczka; {
                    k++;

                }
                System.out.println("Klient wziął pożyczkę:" + pozyczka);
                System.out.println("Bank pożyczka stan konta:" + bank.getWezpozyczke());
                System.out.println("Klient pożyczka stan konta:" + klient.getwezpozyczke());

            }
        }

        // Klient lokata
        if(klient.zaluzLokate>0){
            int lokata=klient.zaluzLokate;
            bank.ZaluzLokate = (int) lokata; {
            }
            System.out.println("Klient założył lokatę:"+ lokata);
            System.out.println("Bank lokata stan konta:" +bank.getZaluzLokate());
            System.out.println("Klient lokata stan konta:" +klient.getzaluzLokate());
        }


    // Klient wpłata
        if(klient.wplata>0) {
            int wplata = klient.wplata;
            switch (bank.Wplata = wplata) {
            }
            System.out.println("Klient wpłacił: "+ wplata);
            System.out.println("Bank wpłata stan konta :" + bank.getWplata());
            System.out.println("Klient wpłata stan konta :" + klient.getwplata());
        }

        if(klient.wyplata>0) {
            int wyplata = klient.wyplata;
            switch (bank.Wyplata = wyplata) {
            }
            System.out.println("Klient wypłacił:"+ wyplata);
            System.out.println("Bank wypłata stan konta:" + bank.getWyplata());
            System.out.println("Klient wypłata stan konta :" + klient.getwyplata());
        }



        // należy stworzyc listę tak jak w Person byłi pracownicy i na liście operacje związne ze stanem konta
        //dota w banku w związku z kontem klient ai jego operacjami




        System.out.println("Stan konta banku"+bank.getStankontaBank());



        System.out.println("Stan konta Klienta"+klient.getStankontaKlienta());



    }
}
