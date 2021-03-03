package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Rhombus extends Figure{
    private int majorDiagonal;
    private int minorDiagonal;
    public Rhombus(int majorDiagonal, int minorDiagonal) {
        super("Diamond");
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }
    public double getArea() {
        return majorDiagonal * minorDiagonal / 2;
    }

    public void print() {
        System.out.println("******");
        System.out.println(" ******");
        System.out.println("  ******");
        System.out.println("   ******");
        System.out.println("    ******");
    }
}
