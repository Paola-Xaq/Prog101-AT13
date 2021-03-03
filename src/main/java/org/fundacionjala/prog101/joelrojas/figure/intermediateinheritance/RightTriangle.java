package org.fundacionjala.prog101.joelrojas.figure.intermediateinheritance;

public class RightTriangle extends Figure{
    private int height;
    private int base;
    public RightTriangle(int height, int base) {
        super("RightTriangle");
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return base * height / 2;
    }

    public void print() {
        System.out.println();
    }
}
