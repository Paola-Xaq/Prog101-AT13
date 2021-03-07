package org.fundacionjala.prog101.joelrojas.game;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing...");
    }
}
