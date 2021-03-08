package org.fundacionjala.prog101.PaolaAguilar.Game;

public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I cannot, I'm invisible...");
    }
}
