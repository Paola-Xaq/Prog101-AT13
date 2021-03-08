package org.fundacionjala.prog101.DanielaSC.solution2;

public abstract class FlatFigure extends AbstractFigure {
    public String type;
    public FlatFigure(String type) {
        super("FlatFigure");
    }

    public double getArea(int a, int b) {
        return a * b;
    }

    public void print(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
