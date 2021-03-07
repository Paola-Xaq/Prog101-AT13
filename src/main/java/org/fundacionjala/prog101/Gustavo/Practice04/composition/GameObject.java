package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class GameObject implements VisibleDelegate, MovableDelegate{
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;
    CollidableDelegate collidableDelegate;

    GameObject(VisibleDelegate visibleDelegate, MovableDelegate movableDelegate, CollidableDelegate collidableDelegate) {
        this.collidableDelegate = collidableDelegate;
        this.movableDelegate = movableDelegate;
        this.visibleDelegate = visibleDelegate;
    }

    @Override
    public void draw() {
        visibleDelegate.draw();
    }

    @Override
    public void move() {
        movableDelegate.move();
    }
}
