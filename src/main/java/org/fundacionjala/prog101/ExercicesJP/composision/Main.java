package org.fundacionjala.prog101.ExercicesJP.composision;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        AnyObjectDelegate building = new GameObject(new Visible(), new NotMovable(), new Solid());
//        building.draw();
//        building.move();
//        building.collide();

        AnyObjectDelegate cloud = new GameObject(new Visible(), new Movable(), new NotSolid());
//        cloud.draw();
//        cloud.move();
//        cloud.collide();

        List<AnyObjectDelegate> gameObjects = new ArrayList<>();
        gameObjects.add(building);
        gameObjects.add(cloud);

        for (AnyObjectDelegate gameObject : gameObjects) {
            gameObject.draw();
            gameObject.move();
            gameObject.collide();
        }
    }
}
