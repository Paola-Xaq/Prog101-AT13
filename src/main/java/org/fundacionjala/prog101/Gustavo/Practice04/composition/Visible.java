package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing ");
    }
}
