package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

public class Circle extends Figure{
    int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void print() {
        System.out.println("    **    ");
        System.out.println(" *      * ");
        System.out.println("*        *");
        System.out.println(" *      * ");
        System.out.println("    **    ");
    }
}
