package org.fundacionjala.prog101.edsonAnawaya.practice1.calculator;

public class Calculator {

    private static final int CHARACTER_CODE_0 = 48;
    private static final int CHARACTER_CODE_9 = 57;
    private static final int DELIMITER_END = 3;
    private static final int LIMIT_SUP = 1000;
    private static final int DELIMITER_END_BRACKET = 3;

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
     * Function for sum a string with customer delimiters
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

    /**
     * Function for sum a string with number positives without numbers negatives
     */
    public int sumNumbersWithoutNumbersNegatives(final String numbers) {
        int sumTotal = 0;
        String newDelimiter = numbers.substring(numbers.indexOf("//") + 2, DELIMITER_END);
        String newStringNumbers = numbers.substring(numbers.indexOf("//") + DELIMITER_END + 1);
        String[] arrayNumbers = newStringNumbers.split(newDelimiter);
        String negativesNumbers = "";
        boolean switchNegativeNumbers = false;
        for (String number : arrayNumbers) {
            if (Integer.parseInt(number) > 0) {
                sumTotal += Integer.parseInt(number);
            } else {
                negativesNumbers += number + " ";
                switchNegativeNumbers = true;
            }
        }
        if (switchNegativeNumbers) {
            throw new IllegalArgumentException("Negatives not allowed :" + negativesNumbers);
        }
        return sumTotal;
    }

    /**
     * Function for sum a string with number positives and less than 1001
     */
    public int sumNumbersLessThan1001(final String numbers) {
        int sumTotal = 0;
        String newDelimiter = numbers.substring(numbers.indexOf("//") + 1, DELIMITER_END);
        String newStringNumbers = numbers.substring(numbers.indexOf("//") + DELIMITER_END + 2);
        String[] arrayNumbers = newStringNumbers.split(newDelimiter);
        String negativesNumbers = "";
        boolean switchNegativeNumbers = false;
        for (String number : arrayNumbers) {
            if (Integer.parseInt(number) > 0) {
                if (Integer.parseInt(number) <= LIMIT_SUP) {
                    sumTotal += Integer.parseInt(number);
                }
            } else {
                negativesNumbers += number + " ";
                switchNegativeNumbers = true;
            }
        }
        if (switchNegativeNumbers) {
            throw new IllegalArgumentException("Negatives not allowed :" + negativesNumbers);
        }
        return sumTotal;
    }

    /**
     * Function for sum a string with number positives and multiples delimiter
     */
    public int sumNumbersWithMultiplesDelimiters(final String numbers) {
        int sumTotal = 0;
        String multiplesDelimiter = "";
        String newStringNumbers = numbers;

        if (numbers.indexOf("//") >= 0) {
            do {
                multiplesDelimiter += newStringNumbers.substring(newStringNumbers.indexOf("[") + 1, newStringNumbers.indexOf("[") + 2);
                newStringNumbers = newStringNumbers.substring(newStringNumbers.indexOf("[") + DELIMITER_END_BRACKET);
            } while (newStringNumbers.indexOf("[") >= 0);
        }
        String newNumber = "";
        boolean switchBooleanDelimiter = false;
        for (int i = 0; i < newStringNumbers.length(); i++) {
            for (int j = 0; j < multiplesDelimiter.length(); j++) {
                if (newStringNumbers.charAt(i) == multiplesDelimiter.charAt(j)) {
                    switchBooleanDelimiter = true;
                    break;
                }
            }
            if (newStringNumbers.charAt(i) >= CHARACTER_CODE_0 && newStringNumbers.charAt(i) <= CHARACTER_CODE_9) {
                newNumber += newStringNumbers.charAt(i);
            }
            if (switchBooleanDelimiter) {
                sumTotal += Integer.parseInt(newNumber);
                newNumber = "";
                switchBooleanDelimiter = false;
            }
        }
        if (newNumber != "") {
            sumTotal += Integer.parseInt(newNumber);
        }

        return sumTotal;
    }
}
