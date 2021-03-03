package org.fundacionjala.prog101.Saul.ImplementationFirst;

public class Rectangle extends Figure {
    private int height;
    private int base;
    public Rectangle(int height, int base) {
        this.height = height;
        this.base = base;
    }
    public double getArea() {
        return height * base;
    }
    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < base; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
