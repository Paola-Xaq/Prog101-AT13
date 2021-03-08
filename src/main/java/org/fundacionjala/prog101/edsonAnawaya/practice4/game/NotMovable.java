package org.fundacionjala.prog101.edsonAnawaya.practice4.game;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move");
    }
}
