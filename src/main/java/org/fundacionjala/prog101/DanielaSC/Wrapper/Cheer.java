package org.fundacionjala.prog101.DanielaSC.Wrapper;

public class Cheer {
    char nuevoChar;
    public Cheer(char Character) {
        nuevoChar = Character;
    }

    public String charToString() {
        String charString = "" + nuevoChar;
        return charString;
    }

    public char getNuevoChar() {
        return nuevoChar;
    }
}
