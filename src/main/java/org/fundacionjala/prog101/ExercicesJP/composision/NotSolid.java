package org.fundacionjala.prog101.ExercicesJP.composision;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splash");
    }
}
