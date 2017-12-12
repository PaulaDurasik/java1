package Czwartytydzien;


public class CircleShape extends Shape  {
    private double radius;
    public CircleShape(){

    }

    public CircleShape(double radius){
        this.radius=radius;
    }
    public CircleShape(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return radius+ getColor()+getArea();
    }
}
