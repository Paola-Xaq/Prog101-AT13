package org.fundacionjala.prog101.Gustavo.Practice03.Solution03;

public class Squar extends Figure {
    private int side;
    FigurePlane figurePlane;

    Squar(int side) {
        this.side = side;
        figurePlane = new FigurePlane(side, side);
    }

    public double getArea() {
        return figurePlane.getArea();
    }

    public void drawn() {
        figurePlane.drawn();
    }
}
