package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Square extends PlaneFigure{
    private int side;
    public Square(int side) {
        super("Square");
        this.side = side;
    }
    public double getArea() {
        return super.getArea(side,side);
    }

    public void print() {
        super.print(side,side);
    }
}
