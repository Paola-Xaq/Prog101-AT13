package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

public class TriangleRectangle extends AbstractFigure{
    int base;
    int height;

    TriangleRectangle(int base, int height) {
        super("Triangle Rectangle");
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return (base * height) / 2;
    }

    void print() {
        System.out.println("*");
        System.out.println("*  *");
        System.out.println("*    *");
        System.out.println("*      *");
        System.out.println("*        *");
        System.out.println("*          *");
        System.out.println("* * * * * * * *");
    }
}
