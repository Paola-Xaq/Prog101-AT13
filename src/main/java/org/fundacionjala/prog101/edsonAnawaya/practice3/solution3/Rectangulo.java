package org.fundacionjala.prog101.edsonAnawaya.practice3.solution3;

public class Rectangulo extends Figura {
    private int altura;
    private int base;
    private FiguraPlana figuraPlana;

    public Rectangulo(int altura, int base) {
        super("Rectangulo");
        this.altura = altura;
        this.base = base;
        this.figuraPlana = new FiguraPlana();
    }

    @Override
    public double getArea() {
        return this.figuraPlana.getArea();

    }

    @Override
    public void dibujar() {
        this.figuraPlana.dibujar(this.altura, this.base);
    }
}
