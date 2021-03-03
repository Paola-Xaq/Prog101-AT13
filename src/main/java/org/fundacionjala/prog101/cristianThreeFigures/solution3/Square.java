package org.fundacionjala.prog101.cristianThreeFigures.solution3;

public class Square extends Figure{
    int side;
    FlatFigure flatFigure;
    Square(int side) {
        super("Square");
        this.side = side;
        this.flatFigure = new FlatFigure();
    }

    public double getArea() {
        return flatFigure.getArea(side);
    }

    public void print() {
        flatFigure.print(side);
    }

}
