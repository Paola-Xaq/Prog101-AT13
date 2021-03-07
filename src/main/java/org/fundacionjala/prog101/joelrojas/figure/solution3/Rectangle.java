package org.fundacionjala.prog101.joelrojas.figure.solution3;

public class Rectangle extends Figure{
    private int height;
    private int base;
    private PlaneFigure planeFigure;
    public Rectangle(int base, int height) {
        super("Rectangle");
        this.height = height;
        this.base = base;
        this.planeFigure = new PlaneFigure();
    }

    public double getArea() {
        return planeFigure.getArea(base, height);
    }

    public void print() {
        planeFigure.print(base, height);
    }
    public static void main(String[] args) {
        new Rectangle(8, 3).print();
    }
}
