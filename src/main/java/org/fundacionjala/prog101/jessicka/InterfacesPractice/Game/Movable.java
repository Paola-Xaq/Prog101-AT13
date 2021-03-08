package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I am moving...");
    }
}
