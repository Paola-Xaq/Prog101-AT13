package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion3;

public class Square extends Figure{
    private int side;
    PlaneFigure planeFigure;
    public Square(int side) {
        super("Square");
        this.side = side;
        this.planeFigure= new  PlaneFigure();
    }
    public double getArea() {
        return planeFigure.getArea(side,side);
    }

    public void print() {
        planeFigure.print(side,side);
    }
}
