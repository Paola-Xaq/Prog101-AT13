package org.fundacionjala.prog101.joelrojas.game;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Powww - capum");
    }
}
