package org.fundacionjala.prog101.Saul.ImplementationThird;

public class Main {
    public static void main(final String[] args) {
        Figure square = new Square(5);
        Figure rectangle = new Rectangle(7, 3);
        Figure diamond = new Diamond(4, 5);
        System.out.println(square + "Area = " + square.getArea());
        square.draw();
        System.out.println(rectangle + "Area = " + rectangle.getArea());
        rectangle.draw();
        System.out.println(diamond + "Area = " + diamond.getArea());
    }
}
