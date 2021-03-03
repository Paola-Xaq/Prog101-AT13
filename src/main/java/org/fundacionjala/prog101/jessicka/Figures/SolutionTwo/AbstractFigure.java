package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

public class AbstractFigure {
    String type;

    AbstractFigure(String type) {
        this.type = type;
    }

    double getArea() {
        return -1;
    }

    void print() {
        System.out.println("--------------------");
    }
}
