package org.fundacionjala.prog101.Saul.Research;

/**
 * Class to try boxing concept.
 */
public class Boxing {
    /**
     * Method to return int value of Integer / unboxing
     * @param integerObject
     * @return
     */
    public int getIntValue(final Integer integerObject) {
        //unboxing
        int res = integerObject;
        return res;
    }

    /**
     * Method to create an Integer Object with given privimite int / boxing
     * @param value
     * @return
     */
    public Integer createObjectInteger(final int value) {
        //boxing
        Integer object = value;
        return object;
    }
}
