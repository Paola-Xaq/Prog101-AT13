package org.fundacionjala.prog101.cristianThreeFigures.solution1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure rectangle = new Rectangle(8, 3);
        Figure square = new Square(5);
        Figure triangle = new Triangle(8, 2);
        Figure rombo = new Rombo(6, 3);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(square);
        figures.add(triangle);
        figures.add(rombo);

        for (Figure figure: figures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(figure);
        }
    }

}
