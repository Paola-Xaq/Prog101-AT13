package org.fundacionjala.prog101.ExercicesJP.solution3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solucion 3");
        Figura rectangle = new Rectangulo(4,3);
        Figura square = new Cuadrado(4);
        rectangle.dibujar();
        System.out.println(rectangle.getArea());
        square.dibujar();
        System.out.println(square.getArea());


    }
}
