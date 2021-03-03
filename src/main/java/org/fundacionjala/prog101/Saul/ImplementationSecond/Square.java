package org.fundacionjala.prog101.Saul.ImplementationSecond;

public class Square extends FlatFigure {
    private int side;
    public Square(int side) {
        type = "Square";
        this.side = side;
    }

    @Override
    public void draw() {
        super.draw(side, side);
    }

    @Override
    public double getArea(int b, int a) {
        return super.getArea(side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                '}';
    }
}