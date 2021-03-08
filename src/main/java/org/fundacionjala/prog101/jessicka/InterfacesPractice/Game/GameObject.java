package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class GameObject {
    CollidableDelegate collidableDelegate;
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;

    GameObject(CollidableDelegate collidableDelegate, VisibleDelegate visibleDelegate, MovableDelegate movableDelegate) {
        this.collidableDelegate = collidableDelegate;
        this.visibleDelegate = visibleDelegate;
        this.movableDelegate = movableDelegate;
    }

    public void collide() {
        collidableDelegate.collide();
    }

    public void draw() {
        visibleDelegate.draw();
    }

    public void move() {
        movableDelegate.move();
    }
}
