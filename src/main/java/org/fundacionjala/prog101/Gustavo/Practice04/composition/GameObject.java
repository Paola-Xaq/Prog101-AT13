package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class GameObject implements VisibleDelegate, MovableDelegate, CollidableDelegate {
    private VisibleDelegate visibleDelegate;
    private MovableDelegate movableDelegate;
    public CollidableDelegate collidableDelegate;

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

    @Override
    public void collide() {
        collidableDelegate.collide();
    }
}
