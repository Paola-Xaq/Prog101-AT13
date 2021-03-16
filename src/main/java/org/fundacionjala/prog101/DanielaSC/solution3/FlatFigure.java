package org.fundacionjala.prog101.DanielaSC.solution3;

public  class FlatFigure {
    public String type;
    public FlatFigure(String type) {
        this.type = type;
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
