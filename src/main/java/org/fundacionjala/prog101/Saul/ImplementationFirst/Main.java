package org.fundacionjala.prog101.Saul.ImplementationFirst;

public class Main {
    public static void main(final String[] args) {
        Figure figureSq = new Square(5);
        System.out.println("Square area: " + figureSq.getArea());
        figureSq.draw();
        Figure figureRect = new Rectangle(6, 3);
        System.out.println("Rectangle area: " + figureRect.getArea());
        figureRect.draw();
        Diamond diamond = new Diamond(4, 5);
        System.out.println("Diamond area: " + diamond.getArea());
        diamond.draw();
    }
}
