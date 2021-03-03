package org.fundacionjala.prog101.edsonAnawaya.practice3.solution3;

import org.fundacionjala.prog101.edsonAnawaya.practice3.solution2.AbstractFigura;

public class Rombo extends AbstractFigura {
    public Rombo() {
        super("Rombo");
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void dibujar() {
        System.out.println("Rombo");
    }
}