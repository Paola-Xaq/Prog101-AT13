package org.fundacionjala.prog101.DanielaSC.solution1;

public class Square extends Figure{
    int side;
    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void print() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.println("*");
            }
        }
    }
}
