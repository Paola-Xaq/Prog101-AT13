package org.fundacionjala.prog101.DanielaSC.solution2;

public class Rectangle extends FlatFigure{
    int height;
    int base;
    public Rectangle(int height, int base) {
        super("Rectangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return super.getArea(height, base);
    }

    @Override
    public void print() {
        super.print(height, base);
    }
}
