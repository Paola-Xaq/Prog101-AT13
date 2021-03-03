package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Circle extends Figure{
    int radius;
    Circle(int radius){
        super("Circle");
        this.radius=radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    void print() {
        System.out.println("   **   ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("   **   ");
    }
}
