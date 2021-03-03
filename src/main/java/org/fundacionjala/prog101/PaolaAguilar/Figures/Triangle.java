package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class Triangle extends Figure{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        super("Right Triangle");
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public void print() {
        System.out.println("     *    ");
        System.out.println("    **    ");
        System.out.println("   ****   ");
        System.out.println("  ******  ");
    }
}
