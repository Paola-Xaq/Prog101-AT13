package org.fundacionjala.prog101.Saul.ImplementationSecond;

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
    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                '}';
    }
}
