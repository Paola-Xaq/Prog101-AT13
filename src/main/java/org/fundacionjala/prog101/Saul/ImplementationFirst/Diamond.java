package org.fundacionjala.prog101.Saul.ImplementationFirst;

public class Diamond extends Figure {
    private int base;
    private int height;
    public Diamond(int base, int height) {
        type = "Diamond";
        this.height = height;
        this.base = base;
    }
    public double getArea() {
        return (base * height) / 2;
    }
    public void draw() {
        System.out.println("           *          ");
        System.out.println("         * * *        ");
        System.out.println("       * * * * *      ");
        System.out.println("     * * * * * * *    ");
        System.out.println("   * * * * * * * * *  ");
        System.out.println("     * * * * * * *    ");
        System.out.println("       * * * * *      ");
        System.out.println("         * * *        ");
        System.out.println("           *          ");

    }
}
