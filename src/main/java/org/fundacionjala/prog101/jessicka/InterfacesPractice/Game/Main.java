package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Solid(), new Visible(), new NotMovable());
        GameObject cloud = new GameObject(new NotSolid(), new Visible(), new Movable());
        GameObject tree = new GameObject(new Solid(), new Visible(), new NotMovable());
        GameObject horse = new GameObject(new Solid(), new Visible(), new Movable());

        ArrayList<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);
        gameObjects.add(tree);
        gameObjects.add(horse);
        for (GameObject gameObject: gameObjects) {
            gameObject.collide();
            gameObject.draw();
            gameObject.move();
            System.out.println("/////////////////////////");
        }
    }
}
