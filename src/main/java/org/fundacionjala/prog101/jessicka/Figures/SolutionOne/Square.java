package org.fundacionjala.prog101.jessicka.Figures.SolutionOne;

public class Square extends Figure{
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
