package org.fundacionjala.prog101.Saul.InterfacesImplementation;

public class QueenPiece implements StraightMove, SidewaysMove, DiagonalMove{
    /**
     * 15.12.3. Compile-Time Step 3: Is the Chosen Method Appropriate?
     *
     * In the case that a superinterface overrides a method declared in a grandparent interface, this
     * rule prevents the child interface from "skipping" the override by simply adding the grandparent
     * to its list of direct superinterfaces. The appropriate way to access functionality of a grandparent
     * is through the direct superinterface, and only if that interface chooses to expose the desired behavior.
     * (Alternately, the developer is free to define his own additional superinterface that exposes the desired
     * behavior with a super method invocation.)
     */
    public void move() {
        SidewaysMove.super.move();
        //StraightMove.super.move();
    }
    /**
     * An interface can't extend same default methods from two superInterfaces
     */
    /**
     * An interface cannot reinherit a method that has already been overriden by another of its superInterfaces
     */
}
