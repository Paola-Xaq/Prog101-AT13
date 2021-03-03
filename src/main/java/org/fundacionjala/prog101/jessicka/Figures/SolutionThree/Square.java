package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

public class Square extends Figure{
    int side;
    FlatFigure flatFigure;

    Square(int side) {
        super("Square");
        this.side = side;
        this.flatFigure = new FlatFigure();
    }

    double getArea() {
        return flatFigure.getArea(side, side);
    }

    void print() {
        flatFigure.print(side, side);
    }
}
