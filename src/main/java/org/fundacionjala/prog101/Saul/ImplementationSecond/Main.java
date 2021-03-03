package org.fundacionjala.prog101.Saul.ImplementationSecond;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(final String[] args) {
        AbstractFigure square = new Square(5);
        FlatFigure rectangle = new Rectangle(6, 3);
        AbstractFigure circle = new Circle(4);
        System.out.println(square);
        square.draw();
        System.out.println(rectangle);
        rectangle.draw();
        System.out.println(square);
        circle.draw();

    }
}
