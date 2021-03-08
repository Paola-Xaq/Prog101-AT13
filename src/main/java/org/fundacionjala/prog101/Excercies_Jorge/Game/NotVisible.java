package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class NotVisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("I can not draw, I'm hidden >:V");
    }
}
