package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class RectangleSolution2 extends PlaneFigure{
    private int base;
    private int height;

    public RectangleSolution2(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return super.getArea(base, height);
    }

    public void print() {
        super.print(base, height);
    }
}
