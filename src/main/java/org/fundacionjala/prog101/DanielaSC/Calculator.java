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

    /**
     * Sum an unknown amount of numbers and handles diferent delimeters.
     * */
    public int sumWithDiferentDelimeter(final String numbers) {
        int positionDelimeter = 2;
        int initSubString = 2 + 2;
        char delimeterChar = numbers.charAt(positionDelimeter);
        String delimeterString = String.valueOf(delimeterChar);
        String numbersOnly = numbers.substring(initSubString);
        String[] numbersString = numbersOnly.split(delimeterString);
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
     * Sum numbers minors than tousand with delimeters of any length.
     * */
    public int sumNumberswithDelimetersofAnyLength(final String numbers) {
        String[] numbersString = numbers.split("\n");
        String part1 = numbersString[0];
        String part2 = numbersString[1];
        int initSubString = 2 + 1;
        String delimeter = part1.substring(initSubString, part1.length() - 1);
        int sum = 0;
        String[] numbersString2 = part2.split(delimeter);
        for (String number : numbersString2) {
            if (number.equals("")) {
                number = "0";
            }
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
