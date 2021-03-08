package org.fundacionjala.prog101.Saul.InterfacesImplementation;

public interface SidewaysMove extends StraightMove {
    @Override
    default void move() {
        System.out.println("Piece moves sideways");
    }
}
