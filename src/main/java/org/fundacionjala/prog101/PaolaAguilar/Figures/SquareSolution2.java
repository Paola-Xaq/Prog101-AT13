package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class SquareSolution2 extends PlaneFigure{
    private int side;

    public SquareSolution2(int side) {
        super("Square");
        this.side = side;
    }

    public double getArea() {
        return super.getArea(side, side);
    }

    public void print() {
        super.print(side, side);
    }
}
