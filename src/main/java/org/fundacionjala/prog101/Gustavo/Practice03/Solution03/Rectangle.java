package org.fundacionjala.prog101.Gustavo.Practice03.Solution03;

public class Rectangle extends Figure {
    private int high;
    private int base;
    FigurePlane figurePlane;
    Rectangle(int high, int base){
        this.base=base;
        this.high=high;
        figurePlane=new FigurePlane(base,high);
    }
    public double getArea(){
        return figurePlane.getArea();
    }
    public void drawn(){
        figurePlane.drawn();
    }
}
