package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I can not, I am invisible");
    }
}
