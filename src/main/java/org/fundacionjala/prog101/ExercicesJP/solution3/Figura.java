package org.fundacionjala.prog101.ExercicesJP.solution3;

public abstract class Figura {
    public String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double getArea();
    public abstract void dibujar();
}
