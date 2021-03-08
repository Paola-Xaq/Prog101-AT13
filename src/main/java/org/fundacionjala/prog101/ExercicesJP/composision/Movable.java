package org.fundacionjala.prog101.ExercicesJP.composision;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I am moving");
    }
}
