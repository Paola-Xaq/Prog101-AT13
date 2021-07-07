package org.fundacionjala.prog101.cristianThreeFigures.solution3;

public class Rombo extends Figure{

    int diagonalMajor;
    int diagonalMinor;
    public Rombo(int diagonalMajor, int diagonalMinor) {
        super("Rombo");
        this.diagonalMajor = diagonalMajor;
        this.diagonalMinor = diagonalMinor;
    }

    public double getArea() {
        return diagonalMajor * diagonalMinor / 2;
    }

    public void print() {
        System.out.println("        *       ");
        System.out.println("       * *      ");
        System.out.println("      *   *     ");
        System.out.println("     *     *    ");
        System.out.println("    *       *   ");
        System.out.println("   *         *  ");
        System.out.println("    *       *   ");
        System.out.println("     *     *    ");
        System.out.println("      *   *     ");
        System.out.println("       * *      ");
        System.out.println("        *       ");
    }

}
