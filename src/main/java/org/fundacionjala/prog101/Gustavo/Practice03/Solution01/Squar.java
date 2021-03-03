package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class Squar {

    private int side;

    Squar(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void drawn() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
