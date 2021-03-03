package org.fundacionjala.prog101.PaolaAguilar.Figures;

public abstract  class PlaneFigure extends Figure{

    public PlaneFigure(String type) {
        super(type);
    }

    public double getArea(int base, int height) {
        return base * height;
    }

    public void print(int base, int height) {
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < base ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
