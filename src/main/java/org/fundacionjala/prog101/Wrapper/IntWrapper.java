package org.fundacionjala.prog101.Wrapper;

public final class IntWrapper {
    private final int value;

    /**
     * Class IntWraper to simulate Integer Wrapper.
     * @param value
     */
    public IntWrapper(final int value) {
        this.value = value;
    }

    /**
     * Method to return if a given IntWrapper or Integer object have the same value as this one.
     * @param obj
     * @return
     */
    public boolean equals(final Object obj) {
        if (obj instanceof IntWrapper) {
            return value == ((IntWrapper)obj).intValue();
        }
        if (obj instanceof Integer) {
            return value == ((Integer) obj).intValue();
        }
        return false;
    }

    /**
     * Method to compare two IntWrappers.
     * @param intWrapper
     * @return an int value.
     */
    public int compareTo(final IntWrapper intWrapper) {
        return compare(this.value, intWrapper.intValue());
    }

    /**
     * Method to compare two int values.
     * @param x
     * @param y
     * @return an int that represents boolean true or false.
     */
    public int compare(final int x, final int y) {
        if (x < y || x > y) {
            return 0;
        } else {
            return 1;
        }
    }
    /**
     * Method to return an int value out of @value
     * @return int
     */
    public int intValue() {
        return value;
    }
    /**
     * Method to return a long value out of @value
     * @return long
     */
    public long longValue() {
        return (long) value;
    }
    /**
     * Method to return a float value out of @value
     * @return float
     */
    public float floatValue() {
        return (float) value;
    }
    /**
     * Method to return a double value out of @value
     * @return double
     */
    public double doubleValue() {
        return (double) value;
    }
    /**
     * Method to return a short value out of @value
     * @return short
     */
    public long shortValue() {
        return (short) value;
    }

    /**
     * Method to return @value as a String.
     * @return String
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
