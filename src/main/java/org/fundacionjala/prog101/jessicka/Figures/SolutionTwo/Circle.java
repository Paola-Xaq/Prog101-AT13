package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

public class Circle extends AbstractFigure{
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
