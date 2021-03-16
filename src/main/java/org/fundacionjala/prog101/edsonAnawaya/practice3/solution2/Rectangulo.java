package org.fundacionjala.prog101.edsonAnawaya.practice3.solution2;

public class Rectangulo extends FiguraPlana {
    public int base;
    public int altura;

    public Rectangulo(int base, int altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return altura * this.base;
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
