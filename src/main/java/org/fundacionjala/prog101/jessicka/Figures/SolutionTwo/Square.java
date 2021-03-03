package org.fundacionjala.prog101.jessicka.Figures.SolutionTwo;

public class Square extends FlatFigure{
    int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    void print() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
