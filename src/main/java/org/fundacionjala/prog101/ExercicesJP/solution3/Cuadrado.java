package org.fundacionjala.prog101.ExercicesJP.solution3;

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
        return figuraPlana.getArea(this.lado);
    }

    @Override
    public void dibujar() {
        figuraPlana.dibujar(this.lado);
    }
}
