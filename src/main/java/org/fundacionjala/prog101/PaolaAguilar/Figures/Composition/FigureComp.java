package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public abstract class FigureComp {
    String type;

    FigureComp(String type) {
        this.type = type;
    }

    public abstract double getArea();
    public abstract void print();

    @Override
    public String toString() {
        return "Figure{" +
                "type = '" + type + '\'' +
                '}';
    }
}
