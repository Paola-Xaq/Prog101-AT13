package org.fundacionjala.prog101.edsonAnawaya.practice3.solution1;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
