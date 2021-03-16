package org.fundacionjala.prog101.DanielaSC.Game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("splash");
    }
}
