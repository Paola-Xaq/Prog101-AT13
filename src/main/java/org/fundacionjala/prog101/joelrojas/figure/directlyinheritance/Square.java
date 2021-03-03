package org.fundacionjala.prog101.joelrojas.figure.directlyinheritance;

public class Square extends Figure{
    private int side;
    public Square(int side) {
        super("Square");
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Square(3).print();
    }
}
