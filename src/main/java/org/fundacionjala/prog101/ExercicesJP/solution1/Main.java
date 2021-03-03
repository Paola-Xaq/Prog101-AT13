package org.fundacionjala.prog101.ExercicesJP.solution1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solucion 1");
        Figura rectangle = new Rectangulo(4,2);
        Figura square = new Cuadrado(3);
        rectangle.dibujar();
        System.out.println(rectangle.getArea());
        square.dibujar();
        System.out.println(square.getArea());
    }
}
