package org.fundacionjala.prog101.ExercicesJP.solution3;

public  class FiguraPlana {

    public double getArea(int a , int b) {
        return a * b;
    }

    public double getArea(int a ) {
        return a * a;
    }

    public void dibujar(int a , int b) {
        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void dibujar(int a) {
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
