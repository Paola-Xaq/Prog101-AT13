package org.fundacionjala.prog101.edsonAnawaya;

public class Calculator {

    public Calculator() {
    }

    /**
     * Function empty return 0
     */
    public int add(final String numbers) {
        return 0;
    }

    /**
     * Function sum a string with number or numbers
     */
    public int sumNumbers(final String numbers) {
        if (numbers == "") {
            return 0;
        }
        String[]arrayStrings = numbers.split(",");
        int sumTotal = 0;
        for (String number : arrayStrings) {
            sumTotal += Integer.parseInt(number);
        }

        return sumTotal;
    }
}
