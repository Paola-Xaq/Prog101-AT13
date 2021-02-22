package org.fundacionjala.prog101.PaolaAguilar;

public class Calculator {

    private String delimiter = "\\r?\\n|\\,";

    /**
     *
     */
    public int sum(final String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = getNumbers(numbers);
        for (String number: numbersArray) {
            if (!(number.length() == 0)) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    /**
     *
     * */
    public String[] getNumbers(final String numbers) {
        if (numbers.startsWith("//")) {
            int inferiorLimit = 2;
            int superiorLimit = 3;
            delimiter = "\\r?\\n|\\" + numbers.substring(inferiorLimit, superiorLimit);
            return numbers.substring(superiorLimit).split(delimiter);
        }
        return numbers.split(delimiter);
    }
}