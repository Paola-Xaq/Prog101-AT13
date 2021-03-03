package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

public abstract class Figure {
    String type;

    Figure(String type) {
        this.type = type;
    }

    double getArea() {
        return -1;
    }

    void print() {
        System.out.println("--------------------");
    }
}
