package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

import org.fundacionjala.prog101.jessicka.Figures.SolutionOne.Figure;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        Circle circle = new Circle(3);
        TriangleRectangle triangleRectangle = new TriangleRectangle(4, 9);
        Rhombus rhombus = new Rhombus(8, 5);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(5, 3);

        ArrayList<AbstractFigure> abstractFigures = new ArrayList<>();
        abstractFigures.add(circle);
        abstractFigures.add(rectangle);
        abstractFigures.add(rhombus);
        abstractFigures.add(triangleRectangle);
        abstractFigures.add(square);

        for (AbstractFigure abstractFigure: abstractFigures) {
            System.out.println(abstractFigure.getArea());
            abstractFigure.print();
            System.out.println(abstractFigure);
        }
    }
}
