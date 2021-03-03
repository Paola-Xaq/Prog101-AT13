package org.fundacionjala.prog101.DanielaSC.solution2;

public class Diamond extends AbstractFigure{
    int majorDiagonal;
    int minorDiagonal;
    public Diamond(int majorDiagonal, int minorDiagonal) {
        super("Diamond");
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    @Override
    public double getArea() {
        return majorDiagonal * minorDiagonal / 2;
    }

    @Override
    public void print() {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");
    }
}
