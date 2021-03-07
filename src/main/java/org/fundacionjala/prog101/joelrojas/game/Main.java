package org.fundacionjala.prog101.joelrojas.game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Visible(), new NotMovable(), new Solid());
        /*building.draw();
        building.move();
        building.collide;*/
        GameObject cloud = new GameObject(new Visible(), new Movable(), new NotSolid());
        /*cloud.draw();
        cloud.move();
        cloud.collide();*/

        List<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);
        for (GameObject gameObject: gameObjects) {
            gameObject.draw();
            gameObject.move();
            gameObject.collide();
        }
    }
}
