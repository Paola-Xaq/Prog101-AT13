package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

public abstract class FlatFigure extends AbstractFigure{

    FlatFigure(String type) {
        super(type);
    }

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
