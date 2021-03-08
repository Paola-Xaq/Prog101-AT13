package org.fundacionjala.prog101.ExercicesJP.composision;

public class Visible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I am drawing..");
    }
}
