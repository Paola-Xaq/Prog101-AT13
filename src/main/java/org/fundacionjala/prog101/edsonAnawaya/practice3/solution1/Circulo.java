package org.fundacionjala.prog101.edsonAnawaya.practice3.solution1;

public class Circulo extends Figura {
    public Circulo() {
        super("Circulo");
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void dibujar() {
        System.out.println("Circulo");
    }
}
