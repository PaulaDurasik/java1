package Czwartytydzien;

public class UruchShape {
    public static void main(String[] args) {
        CircleShape kolo = new CircleShape(10, "zolty", true);
        System.out.println(kolo.toString());
        RectangleShape prostokat=new RectangleShape(10,"zielony", true);
        System.out.println(prostokat.toString());
    }
}