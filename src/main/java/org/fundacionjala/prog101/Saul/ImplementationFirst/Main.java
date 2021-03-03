package org.fundacionjala.prog101.Saul.ImplementationFirst;

public class Main {
    public static void main(final String[] args) {
        Diamond diamond = new Diamond(4, 5);
        System.out.println(diamond.getArea());
        diamond.draw();
    }
}
