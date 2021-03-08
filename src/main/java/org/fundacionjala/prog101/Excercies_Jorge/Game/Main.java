package org.fundacionjala.prog101.Excercies_Jorge.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameObject trap = new GameObject(new NotVisible(), new Solid(),new NotMovable());
        GameObject cloud = new GameObject(new Visible(),new NotSolid(),new Movable());
        List<GameObject> gameObjecs = new ArrayList<>();
        gameObjecs.add(trap);
        gameObjecs.add(cloud);
        for (GameObject gameObject: gameObjecs) {
            System.out.println("------------------");
            gameObject.collide();
            gameObject.draw();
            gameObject.move();
            System.out.println("------------------");
        }
    }
}
