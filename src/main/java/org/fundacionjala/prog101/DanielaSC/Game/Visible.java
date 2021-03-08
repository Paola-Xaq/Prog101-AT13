package org.fundacionjala.prog101.DanielaSC.Game;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing.... ");
    }
}
