package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move");
    }
}
