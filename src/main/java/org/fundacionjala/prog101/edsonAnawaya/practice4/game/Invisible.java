package org.fundacionjala.prog101.edsonAnawaya.practice4.game;

public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I cannot, I am invisible");
    }
}
