package org.fundacionjala.prog101.Gustavo.Practice04.composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Visible(),new NotMovable(),new Solid());
        GameObject cloud =new GameObject(new Visible(),new Movable(),new NotSolid());
        List<GameObject> gameObjects=new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);

        for (GameObject gameObject : gameObjects) {
            gameObject.collide();
            gameObject.move();
            gameObject.draw();
        }
    }
}
