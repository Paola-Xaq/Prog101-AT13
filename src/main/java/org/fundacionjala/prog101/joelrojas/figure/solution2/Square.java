package org.fundacionjala.prog101.joelrojas.figure.solution2;

public class Square extends PlaneFigure{
    private int side;
    public Square(int side) {
        super("Square");
        this.side = side;
    }
    public double getArea() {
        return super.getArea(side, side);
    }

    public void print() {
        super.print(side, side);
    }

    public static void main(String[] args) {
        new Square(3).print();
    }
}
