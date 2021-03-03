package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class DiamondComp extends FigureComp{
    int mayorD;
    int minorD;

    public DiamondComp(int mayorD, int minorD) {
        super("Diamond");
        this.mayorD = mayorD;
        this.minorD = minorD;
    }

    public double getArea() {
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
