package org.fundacionjala.prog101.cristianThreeFigures.solution3;

public class Triangle extends Figure{

    int base;
    int height;
    Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return base * height / 2;
    }

    void print() {
        System.out.println("        *       ");
        System.out.println("       ***      ");
        System.out.println("      *****     ");
        System.out.println("     *******    ");
        System.out.println("    *********   ");
    }
}

