package org.fundacionjala.prog101.ExercicesJP.solution2;

public class Rectangulo extends Figura {

    private int altura;
    private int base;

    public Rectangulo(int base, int altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base * this.altura;
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < this.altura ; i++) {
            for (int j = 0; j < this.base ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
