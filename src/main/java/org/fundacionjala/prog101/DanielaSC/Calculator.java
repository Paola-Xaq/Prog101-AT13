package org.fundacionjala.prog101.DanielaSC;

public class Calculator {
    /**
     * Take 0, 1 or 2 numbers, and will return their sum .
     */
    public int sum(final String numbers) {
        String[] numbersString = numbers.split(",");
        int sum = 0;
        for (String number : numbersString) {
            if (number.equals("")) {
                number = "0";
            }
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    /**
     * Sum an unknown amount of numbers and handles new lines between numbers.
     * */
    public int sumManyNumbers(final String numbers) {
        String[] numbersString = numbers.split("\n");
        String newNumbers = "";
        int sum = 0;
        for (String number : numbersString) {
            newNumbers += number + ",";
        }
        String[] numbersString2 = newNumbers.split(",");
        for (String number2 : numbersString2) {
            if (number2.equals("")) {
                number2 = "0";
            }
            sum += Integer.parseInt(number2);
        }
        return sum;
    }
}
