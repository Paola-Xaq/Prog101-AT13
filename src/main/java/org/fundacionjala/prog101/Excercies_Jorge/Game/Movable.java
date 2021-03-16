package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("I'm moving >:V");
    }
}
