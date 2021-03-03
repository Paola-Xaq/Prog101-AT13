package org.fundacionjala.prog101.joelrojas.figure.intermediateinheritance;

public class Rectangle extends PlaneFigure{
    private int height;
    private int base;
    public Rectangle(int base, int height) {
        super("Rectangle");
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return super.getArea(base, height);
    }

    public void print() {
        super.print(base, height);
    }
    public static void main(String[] args) {
        new Rectangle(8, 3).print();
    }
}
