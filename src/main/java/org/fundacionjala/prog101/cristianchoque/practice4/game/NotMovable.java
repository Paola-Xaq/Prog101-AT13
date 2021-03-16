package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move");
    }
}