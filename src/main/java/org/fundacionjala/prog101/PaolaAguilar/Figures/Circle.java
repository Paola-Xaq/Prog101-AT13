package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class Circle extends Figure{
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius ;
    }

    void print() {
        System.out.println("   **   ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("   **   ");
    }

}
