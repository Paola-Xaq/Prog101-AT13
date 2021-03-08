package org.fundacionjala.prog101.PaolaAguilar.Game;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I'm drawing...");
    }
}
