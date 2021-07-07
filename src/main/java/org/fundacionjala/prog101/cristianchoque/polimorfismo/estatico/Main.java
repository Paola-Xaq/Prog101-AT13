package org.fundacionjala.prog101.cristianchoque.polimorfismo.estatico;

public class Main {

    public static final Double VAR = 1.5;
    public static void main(String[] args) {
        DemoStatico demo = new DemoStatico();

        System.out.println(demo.sumar(1, 2));
        System.out.println(demo.sumar(1, 2, 2));
        System.out.println(demo.sumar(VAR, 1));
        System.out.println(demo.sumar(1, VAR));

    }

}
