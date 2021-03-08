package org.fundacionjala.prog101.joelrojas.game;

public class Building extends GameObject{
    public Building() {
        super(new Visible(), new NotMovable(), new Solid());
    }
}
