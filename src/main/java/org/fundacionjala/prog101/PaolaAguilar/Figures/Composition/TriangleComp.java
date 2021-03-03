package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class TriangleComp extends FigureComp{
    private int base;
    private int height;

    public TriangleComp(int base, int height) {
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
