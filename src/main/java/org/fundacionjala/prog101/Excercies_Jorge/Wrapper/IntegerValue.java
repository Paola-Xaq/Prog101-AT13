package org.fundacionjala.prog101.Excercies_Jorge.Wrapper;

public class IntegerValue {
    private int i;
    public IntegerValue(final int a) {
        i = a;
    }
    /**
     * Method that increments by one the value of the IntegerValue
     * */
    public void increment() {
        i++;
    }
    /**
     * Method that says converts to String an Integer
     * */
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
