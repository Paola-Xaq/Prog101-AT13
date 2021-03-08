package org.fundacionjala.prog101.DanielaSC.Game;

public class NotMovable implements MovableDelegate {
    @Override
    public void move() {
        System.out.println("I can not move, I am not movable");
    }
}
