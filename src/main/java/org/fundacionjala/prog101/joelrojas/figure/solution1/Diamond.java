package org.fundacionjala.prog101.joelrojas.figure.solution1;

public class Diamond extends Figure{
    private int majorDiagonal;
    private int minorDiagonal;
    public Diamond(int majorDiagonal, int minorDiagonal) {
        super("Diamond");
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    public double getArea() {
        return majorDiagonal *minorDiagonal / 2;
    }

    public void print() {
        System.out.println();
    }
}
