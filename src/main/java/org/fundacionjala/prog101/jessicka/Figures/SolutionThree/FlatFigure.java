package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

public class FlatFigure {
    double getArea(int b, int a) {
        return b * a;
    }

    void print(int b,int a) {
        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
