package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Figure circle = new Circle(90);
        Figure rec = new Rectangle(4,2);
        Figure square = new Square(4);
        ArrayList<Figure> figures= new ArrayList<>();
        figures.add(circle);
        figures.add(rec);
        figures.add(square);
        for (Figure figure:figures) {
            System.out.println(figure.getArea());
            figure.print();
            System.out.println(figure);
        }
    }
}
