package org.fundacionjala.prog101.cristianchoque.polimorfismo.dinamico;

public class Main {

    public static void main(final String[] args) {

        Vehiculo transporte1 = new Vehiculo();
        transporte1.mover();

        Motocicleta transporte2 = new Motocicleta();
        transporte2.mover();

        Vehiculo transporte3 = new Motocicleta();
        transporte3.mover();

    }

}
