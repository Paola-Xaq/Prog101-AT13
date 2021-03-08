package org.fundacionjala.prog101.PaolaAguilar.Game;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move...");
    }
}
