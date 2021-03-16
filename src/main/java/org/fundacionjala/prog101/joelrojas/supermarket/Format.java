package org.fundacionjala.prog101.joelrojas.supermarket;

public class Format {
    public static String complete(String input) {
        return complete(input, 10);
    }
    public static String complete(String input, int lenght) {
        String res = input;
        for (int i = input.length(); i < lenght; i++) {
            res += " ";
        }
        return res;
    }
}
