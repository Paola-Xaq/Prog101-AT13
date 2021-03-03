package org.fundacionjala.prog101.DanielaSC.solution2;

public class AbstractFigure {
    public String type;
    public AbstractFigure(String type) {
        this.type = type;
    }

    public double getArea() {
        return 0;
    }

    public void print() {
        System.out.println("---------------");
    }
}
