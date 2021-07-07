package org.fundacionjala.prog101.cristianThreeFigures.solution2;

public class FlatFigure extends Figure{

    FlatFigure(String type) {
        super(type);
    }

    public double getArea(int a, int b) {
        return a * b;
    }

    public void print(int a, int b) {
        System.out.println();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
