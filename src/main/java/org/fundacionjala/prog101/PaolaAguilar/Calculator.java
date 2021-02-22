package org.fundacionjala.prog101.PaolaAguilar;

public class Calculator {

    private String delimiter = "\\r?\\n|\\,";

    /**
     *
     */
    public int sum(final String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = getNumbers(numbers);
        int sum = 0;
        for (String number: numbersArray) {
            if (!(number.length() == 0)) {
                sum += Integer.parseInt(number);
            }
        }
        String negativesNumbers = negativeNumbers(numbersArray);
        if (!negativesNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed " + negativesNumbers);
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

    /**
     *
     * */
    public String negativeNumbers(final String[] numbers) {
        String negativeNumbers = "";
        for (String negativesNumbers: numbers) {
            if (!negativesNumbers.isEmpty()) {
                if (Integer.parseInt(negativesNumbers) < 0) {
                    negativeNumbers +=  negativesNumbers + ",";
                }
            }
        }
        return negativeNumbers;
    }
}