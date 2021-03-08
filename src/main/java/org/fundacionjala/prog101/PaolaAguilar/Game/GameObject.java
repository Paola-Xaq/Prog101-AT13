package org.fundacionjala.prog101.PaolaAguilar.Game;

public class GameObject {
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;
    CollidableDelegate collidableDelegate;

    GameObject(VisibleDelegate visible, MovableDelegate move, CollidableDelegate collide) {
        visibleDelegate = visible;
        movableDelegate = move;
        collidableDelegate = collide;
    }

    public void collide() {
        collidableDelegate.collide();
    }

    public void move() {
        movableDelegate.move();
    }

    public void draw() {
        visibleDelegate.draw();
    }
}
