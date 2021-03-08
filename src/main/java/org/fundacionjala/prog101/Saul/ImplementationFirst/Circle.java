package org.fundacionjala.prog101.Saul.ImplementationFirst;

public class Circle extends Figure {
    private int radius;
    public Circle(int radius) {
        type = "Circle";
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("           *          ");
        System.out.println("     * * * * * * *    ");
        System.out.println("   * * * * * * * * *  ");
        System.out.println("   * * * * * * * * *  ");
        System.out.println("   * * * * * * * * *  ");
        System.out.println(" * * * * * * * * * * *");
        System.out.println("   * * * * * * * * *  ");
        System.out.println("   * * * * * * * * *  ");
        System.out.println("     * * * * * * *    ");
        System.out.println("           *          ");
    }
}
