package org.fundacionjala.prog101.Saul.GameObjects;

public class GameObject implements VisibleDelegate, MovableDelegate, CollidableDelegate{
    private String objectName;
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;
    CollidableDelegate collidableDelegate;
    public GameObject(String objectName, VisibleDelegate v, MovableDelegate m, CollidableDelegate c) {
        this.objectName = objectName;
        visibleDelegate = v;
        movableDelegate = m;
        collidableDelegate = c;
    }
    @Override
    public void collide() {
        collidableDelegate.collide();
    }
    @Override
    public String move() {
        return objectName + movableDelegate.move();
    }
    @Override
    public String draw() {
        return  objectName + visibleDelegate.draw();
    }
}
