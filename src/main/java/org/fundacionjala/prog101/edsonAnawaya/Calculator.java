package org.fundacionjala.prog101.edsonAnawaya;

public class Calculator {

    private static final int CHARACTER_CODE_0 = 48;
    private static final int CHARACTER_CODE_9 = 57;
    private static final int DELIMITER_END = 3;

    public Calculator() {
    }

    /**
     * Function empty return 0
     */
    public int add(final String numbers) {
        return 0;
    }

    /**
     * Function for sum a string with number or numbers
     */
    public int sumNumbers(final String numbers) {
        if (numbers == "") {
            return 0;
        }
        String[] arrayStrings = numbers.split(",");
        int sumTotal = 0;
        for (String number : arrayStrings) {
            sumTotal += Integer.parseInt(number);
        }

        return sumTotal;
    }

    /**
     * Function for sum a string with number or numbers with salt jump
     */
    public int sumNumbersWithLineJump(final String numbers) {
        if (numbers == "") {
            return 0;
        }
        int sumTotal = 0;
        String numberString = "";
        for (int i = 0; i < numbers.length(); i++) {
            if ((int) numbers.charAt(i) >= CHARACTER_CODE_0 && (int) numbers.charAt(i) <= CHARACTER_CODE_9) {
                numberString += numbers.charAt(i);
            } else {
                sumTotal += Integer.parseInt(numberString);
                numberString = "";
            }
        }
        if (numberString == "") {
            return sumTotal;
        }
        sumTotal += Integer.parseInt(numberString);
        return sumTotal;
    }

    /**
     * Function for sum a string with number or numbers with salt jump
     */
    public int sumNumbersWithCustomerDelimiter(final String numbers) {
        int sumTotal = 0;
        String newDelimiter = numbers.substring(numbers.indexOf("//") + 2, DELIMITER_END);
        String newStringNumbers = numbers.substring(numbers.indexOf("//") + DELIMITER_END + 1);
        String[] arrayNumbers = newStringNumbers.split(newDelimiter);

        for (String number : arrayNumbers) {
            sumTotal += Integer.parseInt(number);
        }
        return sumTotal;
    }
}
