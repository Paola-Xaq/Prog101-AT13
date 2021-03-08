package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class GameObject implements CollidableDelegate,MovableDelegate,VisibleDelegate{
    VisibleDelegate visibleDelegate;
    CollidableDelegate collidableDelegate;
    MovableDelegate movableDelegate;
    GameObject(VisibleDelegate visible, CollidableDelegate collidable,MovableDelegate movable){
        visibleDelegate = visible;
        collidableDelegate = collidable;
        movableDelegate = movable;
    }

    @Override
    public void collide() {
        collidableDelegate.collide();
    }

    @Override
    public void move() {
        movableDelegate.move();
    }

    @Override
    public void draw() {
        visibleDelegate.draw();
    }
}
