package org.fundacionjala.prog101.edsonAnawaya.practice4.game;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing...");
    }
}
