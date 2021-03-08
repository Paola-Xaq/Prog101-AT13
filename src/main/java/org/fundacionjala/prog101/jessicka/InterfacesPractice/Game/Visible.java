package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing...");
    }
}
