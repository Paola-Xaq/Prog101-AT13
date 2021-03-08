package org.fundacionjala.prog101.Saul.GameObjects;

public class Invisible implements VisibleDelegate{
    @Override
    public String draw() {
        return " is invisible, nothing to draw";
    }
}
