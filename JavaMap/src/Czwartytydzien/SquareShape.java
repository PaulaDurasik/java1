package Czwartytydzien;

import java.awt.*;

public  class SquareShape extends RectangleShape {
    //public SquareShape(){
        //super();

   // }
    public SquareShape(double side){
        super(side,side);

    }
    public SquareShape(double side, String color, boolean filled){
        super(side, side,color, filled);
    }

    public double getSide() {
        return getLenght();
    }

    public void setSide(double side) {
        this.setLenght(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLenght(width);


    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
        super.setWidth(lenght);
    }
}
