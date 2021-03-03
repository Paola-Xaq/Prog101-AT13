package org.fundacionjala.prog101.edsonAnawaya.practice3.solution2;


public class FiguraPlana extends AbstractFigura {

    public FiguraPlana(String tipo) {
        super(tipo);
    }


    public double getArea(int b, int a) {
        return b * a;
    }

    public void dibujar(int b, int a) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
