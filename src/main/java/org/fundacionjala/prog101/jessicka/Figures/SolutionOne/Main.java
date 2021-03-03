package org.fundacionjala.prog101.jessicka.Figures.SolutionOne;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(7, 4);
        Rhombus rhombus = new Rhombus(8, 6);
        TriangleRectangle triangleRectangle = new TriangleRectangle(4, 12);
        Square square = new Square(5);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(rhombus);
        figures.add(triangleRectangle);
        figures.add(square);

        for (Figure figure: figures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(figure);
        }
    }
}
