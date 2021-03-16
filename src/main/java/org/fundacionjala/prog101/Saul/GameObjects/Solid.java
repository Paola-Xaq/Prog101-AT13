package org.fundacionjala.prog101.Saul.GameObjects;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Pum!!");
    }
}
