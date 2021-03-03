package org.fundacionjala.prog101.edsonAnawaya.practice3.solution1;

public class Rectangulo extends Figura {
    private int altura;
    private int base;

    public Rectangulo(int altura, int base) {
        super("Rectangulo");
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double getArea() {
        return this.altura * this.base;
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
