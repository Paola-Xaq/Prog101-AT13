package org.fundacionjala.prog101.Saul.ImplementationThird;

public class Main {
    public static void main(final String[] args) {
        FlatFigure square = new Square(5);
        FlatFigure rectangle = new Rectangle(6, 3);
        System.out.println(square);
        square.draw();
        System.out.println(rectangle);
        rectangle.draw();
    }
}
