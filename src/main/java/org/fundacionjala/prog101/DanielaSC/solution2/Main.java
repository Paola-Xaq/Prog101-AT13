package org.fundacionjala.prog101.DanielaSC.solution2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractFigure circle = new Circle(5);
        FlatFigure rectangle = new Rectangle(2,3);
        FlatFigure square = new Square(7);
        AbstractFigure rigthTriangle = new RightTriangle(5,2);
        AbstractFigure diamond = new Diamond(5, 3);

        ArrayList<FlatFigure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rectangle);
        
        
        for (FlatFigure figure : figures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(figure);
        }

        ArrayList<AbstractFigure> abstractFigures = new ArrayList<>();
        abstractFigures.add(rigthTriangle);
        abstractFigures.add(diamond);
        abstractFigures.add(circle);

        for (AbstractFigure figure : abstractFigures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(abstractFigures);
        }
    }
}
