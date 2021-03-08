package org.fundacionjala.prog101.Saul.ImplementationThird;

public class Square extends Figure {
    private int side;
    private FlatFigure flatFigure;
    public Square(int side) {
        type = "Square";
        this.side = side;
        flatFigure = new FlatFigure();
    }
    public double getArea() {
        return flatFigure.getArea(side, side);
    }
    public void draw() {
        flatFigure.draw(side, side);
    }
    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                '}';
    }
}