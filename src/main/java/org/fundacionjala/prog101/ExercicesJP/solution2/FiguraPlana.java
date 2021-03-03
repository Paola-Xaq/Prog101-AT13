package org.fundacionjala.prog101.ExercicesJP.solution2;

public abstract class FiguraPlana extends Figura {

    public FiguraPlana(String tipo) {
        super(tipo);
    }

    public double getArea(int a , int b) {
        return a * b;
    }

    public void dibujar(int a , int b) {
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < b ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
