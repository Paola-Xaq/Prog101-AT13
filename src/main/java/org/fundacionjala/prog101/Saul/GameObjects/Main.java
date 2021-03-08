package org.fundacionjala.prog101.Saul.GameObjects;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameObject tower = new GameObject("Tower", new Visible(), new NotMovable(),new Solid());
        GameObject water = new GameObject("Water", new Visible(), new Movable(),new NotSolid());
        GameObject ghost = new GameObject("Ghost", new Invisible(), new Movable(),new NotSolid());
        List<GameObject> objectList = new ArrayList<>();
        objectList.add(tower);
        objectList.add(water);
        objectList.add(ghost);
        for (GameObject gameObject : objectList) {
            System.out.println(gameObject.draw());
            System.out.println(gameObject.move());
            gameObject.collide();
            System.out.println();
        }
    }
}
