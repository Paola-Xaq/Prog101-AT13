package org.fundacionjala.prog101.cristianThreeFigures.solution3;

public class Rectangle extends Figure{
    int base;
    int height;
    FlatFigure flatFigure;
    Rectangle(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
        this.flatFigure = new FlatFigure();
    }

    public double getArea() {
        return flatFigure.getArea(base, height);
    }

    public void print() {
        flatFigure.print(base, height);
    }
}
