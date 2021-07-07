package org.fundacionjala.prog101.cristianThreeFigures.solution3;

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
        super.print();
        System.out.println("        **      ");
        System.out.println("     *      *   ");
        System.out.println("    *        *  ");
        System.out.println("    *        *  ");
        System.out.println("     *      *   ");
        System.out.println("        **      ");
    }


}