package org.fundacionjala.prog101.Saul.GameObjects;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splash!!");
    }
}
