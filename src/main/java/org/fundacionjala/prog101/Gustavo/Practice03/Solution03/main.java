package org.fundacionjala.prog101.Gustavo.Practice03.Solution03;

import org.fundacionjala.prog101.Gustavo.Practice03.Solution02.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 9);
        RightTriangle triangle = new RightTriangle(10, 5);
        Circle cir = new Circle(10);
        Rhombus rhomb = new Rhombus(4, 5);
        Squar sq = new Squar(7);

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(rect);
        figures.add(sq);
        figures.add(triangle);
        figures.add(cir);
        figures.add(rhomb);

        for (Figure figure : figures) {
            System.out.println();
            System.out.println("--------------------");
            System.out.println(figure.getArea());
            figure.drawn();
        }
    }
}
