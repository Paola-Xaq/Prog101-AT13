package org.fundacionjala.prog101.joelrojas.supermarket;

public final class Format {
    public static final int STANDAR = 10;
    public static final int TOTAL = 35;
    public static final int NAME = 15;

    private Format() {

    }

    public static String complete(String input) {
        return complete(input, STANDAR);
    }
    public static String complete(String input, int lenght) {
        String res = input;
        for (int i = input.length(); i < lenght; i++) {
            res += " ";
        }
        return res;
    }
}
