package org.fundacionjala.prog101.Saul.GameObjects;

public class Movable implements MovableDelegate{
    @Override
    public String move() {
        return " is moving";
    }
}
