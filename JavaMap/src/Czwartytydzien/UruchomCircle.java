package Czwartytydzien;

public class UruchomCircle {
    public static void main(String[] args){

        Circle kolo=new Circle(10,"zielony");
        System.out.println(kolo.toString());
        System.out.println(kolo.getArea());
        Cylinder walec=new Cylinder(10,10,"czerwony");
        System.out.println(walec.toString());
        System.out.println(walec.getVolume());

    }
}
