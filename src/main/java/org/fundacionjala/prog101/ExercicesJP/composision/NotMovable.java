package org.fundacionjala.prog101.ExercicesJP.composision;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I cannot move");
    }
}
