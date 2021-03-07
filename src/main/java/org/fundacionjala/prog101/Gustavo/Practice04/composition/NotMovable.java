package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I can't move");
    }
}
 