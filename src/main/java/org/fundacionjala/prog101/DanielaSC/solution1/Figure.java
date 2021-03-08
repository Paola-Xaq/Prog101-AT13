package org.fundacionjala.prog101.DanielaSC.solution1;

public abstract class Figure {
    public String type;
    public Figure(String type) {
        this.type = type;
    }

    public double getArea() {
        return 0;
    }

    public void print() {
        System.out.println("---------------");
    }
}
