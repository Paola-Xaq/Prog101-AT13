package org.fundacionjala.prog101.edsonAnawaya.practice3.solution3;

public class FiguraPlana {

    public double getArea() {
        return 0;
    }

    public void dibujar(int base, int altura) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}