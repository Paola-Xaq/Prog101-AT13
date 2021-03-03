package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

public class PlaneFigureComp {

    public double getArea(int base, int height) {
        return base * height;
    }

    public void print(int base, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
