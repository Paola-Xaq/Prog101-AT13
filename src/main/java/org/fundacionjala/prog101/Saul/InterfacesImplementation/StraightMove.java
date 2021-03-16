package org.fundacionjala.prog101.Saul.InterfacesImplementation;

public interface StraightMove {
    default void move() {
        System.out.println("Piece moves straight");
    }
}
