package org.fundacionjala.prog101.jessicka.Figures.SolutionOne;

public class Rhombus extends Figure{
    int diagonal1;
    int diagonal2;

    Rhombus(int diagonal1, int diagonal2) {
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    void print() {
        System.out.println("     *     ");
        System.out.println("  *     *  ");
        System.out.println("*         *");
        System.out.println("  *     *  ");
        System.out.println("     *     ");
    }
}
