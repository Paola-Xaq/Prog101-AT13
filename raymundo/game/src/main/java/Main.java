import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameObject player = new GameObject(new Visible(), new Solid(), new Movable());
        GameObject cloud = new GameObject(new Visible(), new NotSolid(), new Movable());
        GameObject building = new GameObject(new Visible(), new Solid(), new NotMovable());
        GameObject trap = new GameObject(new Invisible(), new Solid(), new NotMovable());

        List<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(player);
        gameObjects.add(cloud);
        gameObjects.add(building);
        gameObjects.add(trap);

        for (GameObject gameObject : gameObjects) {
            gameObject.draw();
            gameObject.collide();
            gameObject.move();
            System.out.println();
        }
    }
}
