package org.fundacionjala.prog101.joelrojas.game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I am moving...");
    }
}
