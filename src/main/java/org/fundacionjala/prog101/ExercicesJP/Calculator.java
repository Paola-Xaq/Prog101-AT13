package org.fundacionjala.prog101.ExercicesJP;

public class Calculator {

    /**
     * Method for sum numbers into a String .
     */
    public int add(String numbers) {
        int sum = 0;
        String delimiter = ",|\n";

        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n");
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }

        String[] arrayNumbers = numbers.split(delimiter);
        String negativesNumbers = verifyNegativeNumbers(arrayNumbers);
        if (!negativesNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed " + negativesNumbers);
        }

        for (String number : arrayNumbers) {
            int num = Integer.parseInt(number);
            sum += Integer.parseInt(number);
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
