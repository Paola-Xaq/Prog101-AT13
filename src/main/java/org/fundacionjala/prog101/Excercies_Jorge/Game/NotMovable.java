package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move, I'm waiting for someone");
    }
}
