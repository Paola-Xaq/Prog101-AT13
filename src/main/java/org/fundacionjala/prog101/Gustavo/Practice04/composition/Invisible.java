package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class Invisible implements  VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I can't, I am invisible");
    }
}
