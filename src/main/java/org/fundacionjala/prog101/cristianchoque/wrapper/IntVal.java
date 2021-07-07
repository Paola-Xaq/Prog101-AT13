package org.fundacionjala.prog101.cristianchoque.wrapper;

class IntVal {
    private int i;

    public IntVal(final int a) {
        i = a;
    }

    public void increment() {
        i++;
    }

    public String toString() {
        return Integer.toString(i);
    }
}
