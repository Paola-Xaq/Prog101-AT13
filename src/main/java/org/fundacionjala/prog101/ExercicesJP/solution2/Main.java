package org.fundacionjala.prog101.ExercicesJP.solution2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Solucion 2");
        FiguraPlana rectangle = new Rectangulo(4,2);
        FiguraPlana square = new Cuadrado(3);
        rectangle.dibujar();
        System.out.println(rectangle.getArea());
        square.dibujar();
        System.out.println(square.getArea());

        Figura rectangle2 = new Rectangulo(6,3);
        Figura square2 = new Cuadrado(5);
        rectangle2.dibujar();
        System.out.println(rectangle2.getArea());
        square2.dibujar();
        System.out.println(square2.getArea());
    }
}
