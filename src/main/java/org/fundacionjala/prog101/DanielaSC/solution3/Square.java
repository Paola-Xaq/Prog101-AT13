package org.fundacionjala.prog101.DanielaSC.solution3;

public class Square extends Figure{
    int side;
    FlatFigure flatFigure;
    public Square(int side) {
        super("square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return flatFigure.getArea(side, side);
    }

    @Override
    public void print() {
        flatFigure.print(side, side);
    }
}
