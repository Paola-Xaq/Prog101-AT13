package org.fundacionjala.prog101.ExercicesJP.solution2;

public class Main {
    public static void main(String[] args) {
        Figura rectangle = new Rectangulo(4,2);
        Figura square = new Cuadrado(3);
        rectangle.dibujar();
        System.out.println(rectangle.getArea());
        square.dibujar();
        System.out.println(square.getArea());
    }
}
