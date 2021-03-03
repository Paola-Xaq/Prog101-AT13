package org.fundacionjala.prog101.cristianchoque.polimorfismo.estatico;

public class DemoStatico {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public int sumar(final int x, final int y) {
        return x + y;
    }

    /**
     *
     * @param x
     * @param y
     * @param z
     * @return
     */
    public  int sumar(final int x, final int y, final int z) {
        return x + y + z;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public int sumar(final double x, final int y) {
        return (int) x + y;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public int sumar(final int x, final double y) {
        return x + (int) y;
    }

}
