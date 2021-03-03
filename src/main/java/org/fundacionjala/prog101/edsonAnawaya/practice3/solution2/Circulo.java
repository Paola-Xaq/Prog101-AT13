package org.fundacionjala.prog101.edsonAnawaya.practice3.solution2;

public class Circulo extends AbstractFigura {
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
