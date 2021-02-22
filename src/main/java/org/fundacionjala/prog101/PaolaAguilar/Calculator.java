package org.fundacionjala.prog101.PaolaAguilar;

public class Calculator {

    private String delimiter = ",";

    /**
     *
     */
    public int sum(final String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numberString = numbers.split(delimiter);
        int sum = 0;
        for (String number: numberString) {
            if (!(number.length() == 0)) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
