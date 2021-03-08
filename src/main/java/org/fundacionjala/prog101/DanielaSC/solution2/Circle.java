package org.fundacionjala.prog101.DanielaSC.solution2;

public class Circle extends AbstractFigure {
    int radius;
    public Circle (int radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("   **  ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("   **  ");
    }
}