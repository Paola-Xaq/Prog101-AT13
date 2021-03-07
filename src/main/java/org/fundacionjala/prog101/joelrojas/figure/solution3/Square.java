package org.fundacionjala.prog101.joelrojas.figure.solution3;

public class Square extends Figure{
    private int side;
    private PlaneFigure planeFigure;
    public Square(int side) {
        super("Square");
        this.side = side;
        this.planeFigure = new PlaneFigure();
    }
    public double getArea() {
        return planeFigure.getArea(side, side);
    }

    public void print() {
        planeFigure.print(side, side);
    }

    public static void main(String[] args) {
        new Square(3).print();
    }
}
