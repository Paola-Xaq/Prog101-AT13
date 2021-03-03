package org.fundacionjala.prog101.Saul.ImplementationThird;

public class Square extends FlatFigure {
    private int side;
    public Square() {
        type = "Square";
    }
    public Square(int side) {
        type = "Square";
        this.side = side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public double getArea(int b, int a) {
        return side * side;
    }
    public double getArea() {
        return side * side;
    }
    void draw() {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    void draw(int b, int a) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                '}';
    }
}