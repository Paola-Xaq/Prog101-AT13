package org.fundacionjala.prog101.Saul.GameObjects;

public class NotMovable implements MovableDelegate{
    @Override
    public String move() {
        return " can't move, staying still ...";
    }
}
