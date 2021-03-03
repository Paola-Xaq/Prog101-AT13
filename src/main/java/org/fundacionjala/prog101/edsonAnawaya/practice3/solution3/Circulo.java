package org.fundacionjala.prog101.edsonAnawaya.practice3.solution3;

public class Circulo extends Figura {
    public int radio;

    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("   **  ");
        System.out.println("  **** ");
        System.out.println(" ******");
        System.out.println("********");
        System.out.println(" ******");
        System.out.println("  **** ");
        System.out.println("   **  ");

    }
}