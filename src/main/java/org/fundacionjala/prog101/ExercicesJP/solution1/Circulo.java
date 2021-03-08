package org.fundacionjala.prog101.ExercicesJP.solution1;

import org.opencv.core.Mat;

public class Circulo extends Figura{

    int radius;

    public Circulo(int radius) {
        super("Circulo");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void dibujar() {
        System.out.println("   **  ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("   **  ");
    }
}
