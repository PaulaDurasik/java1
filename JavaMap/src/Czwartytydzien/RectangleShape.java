package Czwartytydzien;

public class RectangleShape extends Shape {
    private double width;
    private double lenght;

    public RectangleShape(int i, String zielony, boolean b) {

    }

    public RectangleShape(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public RectangleShape(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return 2 * width * lenght;
    }

    public String toString() {
        return width+lenght+getColor();

    }
}