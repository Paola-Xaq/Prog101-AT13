package org.fundacionjala.prog101.ExercicesJP.composision;

public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am invisible");
    }
}
