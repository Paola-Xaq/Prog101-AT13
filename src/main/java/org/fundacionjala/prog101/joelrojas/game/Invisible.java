package org.fundacionjala.prog101.joelrojas.game;

public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I cannot, I am invisible");
    }
}