package org.fundacionjala.prog101.Saul.ImplementationFirst;

import org.fundacionjala.prog101.Saul.ImplementationSecond.FlatFigure;

public class Square extends Figure {
    private int side;
    public Square(int side) {
        type = "Square";
        this.side = side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public void draw() {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}