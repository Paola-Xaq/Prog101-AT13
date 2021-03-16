package org.fundacionjala.prog101.Saul.GameObjects;

public class Visible implements VisibleDelegate{
    @Override
    public String draw() {
        return " is being drawn";
    }
}
