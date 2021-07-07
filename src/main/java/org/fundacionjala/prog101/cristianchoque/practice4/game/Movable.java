package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I am moving");
    }
}