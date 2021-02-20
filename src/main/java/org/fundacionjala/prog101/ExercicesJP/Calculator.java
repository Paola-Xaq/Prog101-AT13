package org.fundacionjala.prog101.ExercicesJP;

public class Calculator {

    /**
     * Method for sum numbers into a String .
     */
    public int add(String numbers) {


        String delimiter = ",|\n";

        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n");
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }

        if (delimiter.startsWith("[")) {
            delimiter = delimiter.substring(1, delimiter.length() - 1);
        }
        delimiter = delimiter.replace("][", "|");
        delimiter = "[" + delimiter + "]";


        String[] arrayNumbers = numbers.split(delimiter);
        String negativesNumbers = verifyNegativeNumbers(arrayNumbers);
        if (!negativesNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed " + negativesNumbers);
        }

        return sum(arrayNumbers);
    }

    /**
     * Method return the sum all numbers into a String .
     */
    public int sum(String[] arrayNumbers) {
        int sum = 0;
        final int numberLimit = 1000;
        for (String number : arrayNumbers) {
            int num = Integer.parseInt(number);
            if (num <= numberLimit) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    /**
     * Method for get all negatives numbers into a String .
     */
    public String verifyNegativeNumbers(String[] numbers) {
        String negativeNumbers = "";
        for (String number : numbers) {
            if (Integer.parseInt(number) < 0) {
                negativeNumbers += number + " ";
            }
        }
        return negativeNumbers;
    }
}
