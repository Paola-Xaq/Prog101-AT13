package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class Main {
    public static void main(String[] args) {
        GameObject building = new GameObject(new Visible(),new NotMovable(),new Solid());
        GameObject cloud =new GameObject(new Visible(),new Movable(),new NotSolid());
        
    }
}
