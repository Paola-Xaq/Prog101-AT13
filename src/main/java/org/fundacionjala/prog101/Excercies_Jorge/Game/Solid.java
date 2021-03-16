package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Collides and it's very noisy @#$#@%&^%&");
    }
}
