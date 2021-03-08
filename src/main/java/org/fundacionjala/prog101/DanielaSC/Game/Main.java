package org.fundacionjala.prog101.DanielaSC.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Visible(), new Solid(), new NotMovable());
/*         building.draw();
        building.move();
        building.collide(); */

        GameObject cloud = new GameObject(new Visible(), new NotSolid(), new NotMovable());
/*         cloud.draw();
        cloud.move();
        cloud.collide(); */

        GameObject car = new GameObject(new Visible(), new Solid(), new Movable());

        List<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);
        gameObjects.add(car);

        for (GameObject gameObject: gameObjects) {
            gameObject.draw();
            gameObject.move();
            gameObject.collide();
        }
    }
}
