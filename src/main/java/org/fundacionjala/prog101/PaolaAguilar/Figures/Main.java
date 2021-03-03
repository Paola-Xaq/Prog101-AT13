package org.fundacionjala.prog101.PaolaAguilar.Figures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(2.5);
        Figure rectangle = new Rectangle(8, 3);
        Figure square = new Square(5);
        Figure triangle = new Triangle(5, 3);
        Figure diamond = new Diamond(4, 4);

        //Solution 2
        Figure square2 = new SquareSolution2(4);
        Figure rectangle2 = new RectangleSolution2(5, 3);

        //Solution 3

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(rectangle);
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);
        figures.add(diamond);
        figures.add(square2);
        figures.add(rectangle2);

        for (Figure fig: figures) {
            System.out.println(fig);
            System.out.println(fig.getArea());
            fig.print();
        }
    }
}
