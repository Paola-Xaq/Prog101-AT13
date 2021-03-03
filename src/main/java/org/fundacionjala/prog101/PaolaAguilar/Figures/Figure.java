package org.fundacionjala.prog101.PaolaAguilar.Figures;

public abstract class Figure {
    public String type;

    public Figure(String type) {
        this.type = type;
    }

    abstract double getArea();

    abstract void print();

    @Override
    public String toString() {
        return "Figure{" +
                "type = '" + type + '\'' +
                '}';
    }
}
