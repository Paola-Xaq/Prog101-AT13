package org.fundacionjala.prog101.joelrojas.game;

public class Cloud extends GameObject{
    public Cloud() {
        super(new Visible(), new Movable(), new NotSolid());
    }
}
