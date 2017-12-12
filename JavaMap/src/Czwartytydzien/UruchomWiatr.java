package Czwartytydzien;

import java.awt.*;

public class UruchomWiatr { public static void main(String[] args){
    Wiatr wiatr=new Wiatr(100);

    System.out.println("Mile:"+wiatr.getMile()+" "+ "Wezly:"+ wiatr.getWezly());
    System.out.println(wiatr.tekst());
}
}
