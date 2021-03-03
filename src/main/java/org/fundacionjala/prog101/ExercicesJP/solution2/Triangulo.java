package org.fundacionjala.prog101.ExercicesJP.solution2;

public class Triangulo extends Figura {

    private int base;
    private int altura;

    public Triangulo(int base,int altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (this.base*this.altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("    *  ");
        System.out.println("   ***  ");
        System.out.println("  *****  ");
    }
}
