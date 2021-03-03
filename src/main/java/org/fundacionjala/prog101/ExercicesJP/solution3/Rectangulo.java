package org.fundacionjala.prog101.ExercicesJP.solution3;

public class Rectangulo extends Figura {

    private int altura;
    private int base;
    private FiguraPlana figuraPlana;

    public Rectangulo(int base, int altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
        this.figuraPlana = new FiguraPlana();


    }

    @Override
    public double getArea() {
        return this.figuraPlana.getArea(base,altura);
    }

    @Override
    public void dibujar() {
        this.figuraPlana.dibujar(base,altura);
    }
}
