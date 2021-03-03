package org.fundacionjala.prog101.PaolaAguilar.Figures;

public class Diamond extends Figure{
    int mayorD;
    int minorD;

    public Diamond(int mayorD, int minorD) {
        super("Diamond");
        this.mayorD = mayorD;
        this.minorD = minorD;
    }

    double getArea() {
        return (mayorD * minorD) / 2;
    }

    public void print() {
        System.out.println("       *       ");
        System.out.println("     *   *     ");
        System.out.println("    *      *   ");
        System.out.println("     *    *    ");
        System.out.println("       *       ");
    }
}
