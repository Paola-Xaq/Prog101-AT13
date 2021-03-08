package org.fundacionjala.prog101.PaolaAguilar.Game;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Visible(), new NotMovable(), new Solid());
        GameObject cloud = new GameObject(new Visible(), new Movable(), new NotSolid());

        List<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);

        for (GameObject gameObject: gameObjects) {
            gameObject.draw();
            gameObject.move();
            gameObject.collide();
            System.out.println("-----------");
        }

    }
}
