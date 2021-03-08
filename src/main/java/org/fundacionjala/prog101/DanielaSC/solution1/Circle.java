package org.fundacionjala.prog101.DanielaSC.solution1;

public class Circle extends Figure {
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
