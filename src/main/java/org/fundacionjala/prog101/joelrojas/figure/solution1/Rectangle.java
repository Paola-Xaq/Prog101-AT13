package org.fundacionjala.prog101.joelrojas.figure.solution1;

public class Rectangle extends Figure{
    private int height;
    private int base;
    public Rectangle(int base, int height) {
        super("Rectangle");
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return base * height;
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Rectangle(8, 3).print();
    }
}
