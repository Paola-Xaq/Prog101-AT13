package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class CircleComp extends FigureComp {
    double radius;

    public CircleComp(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("   **   ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("   **   ");
    }
}
