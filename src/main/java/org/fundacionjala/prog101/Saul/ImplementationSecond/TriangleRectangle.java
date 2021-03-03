package org.fundacionjala.prog101.Saul.ImplementationSecond;

public class TriangleRectangle extends Figure {
    private int base;
    private int height;

    public TriangleRectangle(int base, int height) {
        type = "TriangleRectangle";
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return (base * height) / 2;
    }
    public void draw() {
        String rowToPrint = "";
        for (int row = 0; row < height; row++) {
            rowToPrint += " * ";
            System.out.println(rowToPrint);
        }
    }
    @Override
    public String toString() {
        return "TriangleRectangle{" +
                "type='" + type + '\'' +
                '}';
    }
}
