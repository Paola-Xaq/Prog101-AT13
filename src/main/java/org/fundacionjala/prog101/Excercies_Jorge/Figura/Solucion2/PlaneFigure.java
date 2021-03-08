package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public abstract class PlaneFigure extends Figure{

    public PlaneFigure(String type) {
        super(type);
    }

    public double getArea(int a, int b) {
        return a * b;
    }

    public void print(int a, int b) {
        System.out.println();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
