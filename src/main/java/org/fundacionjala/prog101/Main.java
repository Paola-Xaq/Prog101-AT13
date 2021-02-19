package org.fundacionjala.prog101;

import org.fundacionjala.prog101.calculator.*;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        Sum practice1 = new Sum();
        final int number1 = 2;
        final int number2 = 3;
        System.out.println(practice1.sumTwoNumbers(number1, number2));

    }
}
