package org.fundacionjala.prog101.Excercies_Jorge.Wrapper;

public class IntegerValue {
    private int i;
    public IntegerValue(final int a) {
        i = a;
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public void increment() {
        i++;
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
