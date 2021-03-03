package org.fundacionjala.prog101.DanielaSC.polimorfismo;

public class Main {
    public static void main(String[] args) {
        //polimorfismo estatico
        Estatico estatico = new Estatico();
        double resultado;
        int resultado2;
        resultado = estatico.muestra(10.5);
        resultado2 = estatico.muestra(10);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(" ");

        //polimorfismo dinamico
        Figura figura = new Figura("figura");
        Cuadrado cuadrado = new Cuadrado(6);
        System.out.println("Area de la figura:  " + figura.getArea());
        System.out.println("Area del cuadrado: " + cuadrado.getArea());
        
    }
}
