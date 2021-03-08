package org.fundacionjala.prog101.PaolaAguilar.Game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I'm moving.");
    }
}
