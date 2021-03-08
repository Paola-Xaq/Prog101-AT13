package org.fundacionjala.prog101.DanielaSC.Game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I am moving...");
    }
}
