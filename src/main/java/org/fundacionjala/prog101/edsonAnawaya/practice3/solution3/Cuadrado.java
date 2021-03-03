package org.fundacionjala.prog101.edsonAnawaya.practice3.solution3;

public class Cuadrado extends Figura {
    private int lado;
    private FiguraPlana figuraPlana;

    public Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
        this.figuraPlana = new FiguraPlana();
    }

    @Override
    public double getArea() {
        return this.figuraPlana.getArea();

    }

    @Override
    public void dibujar() {
        this.figuraPlana.dibujar(this.lado, this.lado);
    }
}
