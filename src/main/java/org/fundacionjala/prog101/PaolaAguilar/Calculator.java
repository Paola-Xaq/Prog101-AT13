package org.fundacionjala.prog101.PaolaAguilar;

public class Calculator {

    public int sum(final String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numberString = numbers.split(",");
        int sum = 0;
        for (String number: numberString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
