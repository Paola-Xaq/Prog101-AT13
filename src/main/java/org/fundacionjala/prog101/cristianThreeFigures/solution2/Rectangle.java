package org.fundacionjala.prog101.cristianThreeFigures.solution2;

public class Rectangle extends FlatFigure{
    int base;
    int height;
    Rectangle(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return super.getArea(base, height);
    }

    void print() {
        super.print(base, height);
    }
}
