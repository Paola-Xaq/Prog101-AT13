package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

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

    double getArea() {
        return flatFigure.getArea(base, height);
    }

    void print() {
        flatFigure.print(base, height);
    }
}
