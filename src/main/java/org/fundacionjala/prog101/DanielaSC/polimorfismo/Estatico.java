package org.fundacionjala.prog101.DanielaSC.polimorfismo;

public class Estatico {

    public int muestra (int a) {
       System.out.println ("a: " + a);
       return a + 0;
    }

    public void muestra (int a, int b) {
       System.out.println ("a and b: " + a + "," + b);
    }

    public double muestra (double a) {
       System.out.println("double a: " + a);
       return a * a;
    }
}
