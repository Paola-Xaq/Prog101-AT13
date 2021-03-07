package org.fundacionjala.prog101.joelrojas.figure.solution2;

public class Circle extends Figure{
    private int radius;
    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("    *  *  *    ");
        System.out.println(" *  *  *  *  * ");
        System.out.println(" *  *  *  *  * ");
        System.out.println(" *  *  *  *  * ");
        System.out.println("    *  *  *    ");
    }

    public static void main(String[] args) {
        new Circle(3).print();
    }
}
