package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class Rectangle extends Figure {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }

    public void print() {
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < base ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
