package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I move");
    }
}
