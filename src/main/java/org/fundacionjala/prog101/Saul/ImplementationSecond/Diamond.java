package org.fundacionjala.prog101.Saul.ImplementationSecond;

public class Diamond extends AbstractFigure {
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
    @Override
    public String toString() {
        return "Diamond{" +
                "type='" + type + '\'' +
                '}';
    }
}