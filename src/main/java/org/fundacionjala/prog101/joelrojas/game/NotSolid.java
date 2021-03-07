package org.fundacionjala.prog101.joelrojas.game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splashh");
    }
}
