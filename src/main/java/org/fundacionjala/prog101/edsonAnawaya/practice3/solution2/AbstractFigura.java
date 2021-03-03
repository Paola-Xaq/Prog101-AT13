package org.fundacionjala.prog101.edsonAnawaya.practice3.solution2;

public class AbstractFigura {
    public String tipo;

    public AbstractFigura(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return 0;
    }

    public void dibujar() {
        System.out.println("AbstractFigura");
    }

}
