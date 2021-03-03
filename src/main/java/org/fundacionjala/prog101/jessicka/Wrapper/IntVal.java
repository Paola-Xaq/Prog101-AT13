package org.fundacionjala.prog101.jessicka.Wrapper;

public class IntVal {
    private int i;
    public IntVal(int a) {
        i = a;
    }

    public int getVal() {
        return i;
    }

    public void setValue(int a) {
        this.i = a;
    }

    public void increment() {
        i++;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
