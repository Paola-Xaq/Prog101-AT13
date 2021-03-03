package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class RectangleComp extends FigureComp {
    public int base;
    public int height;
    public PlaneFigureComp planeFigure;

    public RectangleComp(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
        this.planeFigure = new PlaneFigureComp();
    }

    public double getArea() {
        return planeFigure.getArea(base, height);
    }

    public void print() {
        planeFigure.print(base, height);
    }
}
