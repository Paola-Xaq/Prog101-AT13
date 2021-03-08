package org.fundacionjala.prog101.DanielaSC.solution2;

public class RightTriangle extends AbstractFigure{
    int height;
    int base;
    public RightTriangle(int height, int base) {
        super("RightTriangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void print() {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
    }
}
