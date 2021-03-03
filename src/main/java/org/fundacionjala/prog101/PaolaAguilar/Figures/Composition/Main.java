package org.fundacionjala.prog101.PaolaAguilar.Figures.Composition;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FigureComp circleComp = new CircleComp(3.5);
        FigureComp rectangleComp = new RectangleComp(2, 3);
        FigureComp squareComp = new SquareComp(3);
        FigureComp triangle = new TriangleComp(4, 6);
        FigureComp diamond = new DiamondComp( 5, 5);


        ArrayList<FigureComp> figures = new ArrayList<>();
        figures.add(circleComp);
        figures.add(rectangleComp);
        figures.add(squareComp);
        figures.add(triangle);
        figures.add(diamond);

        for (FigureComp fig: figures) {
            System.out.println(fig);
            System.out.println(fig.getArea());
            fig.print();
        }
    }
}
