package org.fundacionjala.prog101.ExercicesJP.composision;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Poomm - cabum");
    }
}
