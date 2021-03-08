package org.fundacionjala.prog101.DanielaSC.solution1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(2,3);
        Figure rigthTriangle = new RightTriangle(5,2);
        Figure diamond = new Diamond(5, 3);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(rigthTriangle);
        figures.add(diamond);
        
        for (Figure figure : figures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(figure);
        }
    }
}
