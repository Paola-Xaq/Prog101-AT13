package org.fundacionjala.prog101.Saul.ImplementationSecond;

public class Rectangle extends FlatFigure {
    private int height;
    private int base;
    public Rectangle(int base, int height) {
        type = "Rectangle";
        this.height = height;
        this.base = base;
    }
    public double getArea() {
        return height * base;
    }
    public double getArea(int b, int a) {
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
    public void draw(int b, int a) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < base; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + type + '\'' +
                '}';
    }
}
