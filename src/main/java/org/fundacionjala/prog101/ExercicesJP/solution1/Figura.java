package org.fundacionjala.prog101.ExercicesJP.solution1;

public abstract class Figura {
    public String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double getArea();
    public abstract void dibujar();
}
