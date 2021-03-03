package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class SquareComp extends FigureComp {
    public int side;
    public PlaneFigureComp planeFigure;

    public SquareComp(int side) {
        super("Square");
        this.side = side;
        this.planeFigure = new PlaneFigureComp();
    }

    public double getArea() {
        return planeFigure.getArea(side, side);
    }

    public void print() {
        planeFigure.print(side, side);
    }
}
