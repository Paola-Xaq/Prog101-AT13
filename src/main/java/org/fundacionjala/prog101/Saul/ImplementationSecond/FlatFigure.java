package org.fundacionjala.prog101.Saul.ImplementationSecond;

public abstract class FlatFigure extends AbstractFigure {

    public double getArea(int b, int a) {
        return b * a;
    }
    public void draw(int b, int h) {
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < b; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
