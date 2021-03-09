package org.fundacionjala.prog101.jessicka.Figures.SolutionThree;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        Circle circle = new Circle(6);
        TriangleRectangle triangleRectangle = new TriangleRectangle(6, 13);
        Rhombus rhombus = new Rhombus(9, 6);
        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(4, 5);

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
