package org.fundacionjala.prog101.DanielaSC.solution2;

public class Square extends FlatFigure{
    int side;
    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return super.getArea(side, side);
    }

    @Override
    public void print() {
        super.print(side, side);
    }
}
