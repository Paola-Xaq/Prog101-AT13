package org.fundacionjala.prog101.DanielaSC.solution3;

public class Rectangle extends Figure{
    int height;
    int base;
    FlatFigure flatFigure;
    public Rectangle(int height, int base) {
        super("Rectangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return flatFigure.getArea(height, base);
    }

    @Override
    public void print() {
        flatFigure.print(height, base);
    }
}
