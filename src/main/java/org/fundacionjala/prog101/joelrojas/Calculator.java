package org.fundacionjala.prog101.joelrojas;

public class Calculator {
    public static final int LIMIT = 1000;
    /** */
    public int sum(String numbers) {
        if (isEmpty(numbers)) {
            return 0;
        } else {
            String delimiters = "[,\n]";
            int sum = sum(numbers, delimiters);
            return sum;
        }
    }
    /** */
    public int sum(String[] numbersString) {
        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
    /**
     * @return true if numbers is a empty string.
    */
    public boolean isEmpty(String numbers) {
        return numbers.equals("");

    }
    /** */
    public int sum(String numbers, String delimiters) {
        int sum = 0;
        String number = "";
        for (int i = 0; i < numbers.length(); i++) {
            String character = numbers.substring(i, i + 1);
            if (!character.matches(delimiters)) {
                number += character;
            } else {
                sum += Integer.parseInt(number);
                number = "";
            }
            if (i == numbers.length() - 1) {
                sum += Integer.parseInt(number);
                number = "";
            }
        }
        return sum;
    }
    /** */
    public int sumWithDelimiter(String numbers) {
        int posDelimeter = 2;
        int posNumbersBegin = 2 + 2;
        String delimiter = numbers.substring(2, posDelimeter + 1);
        String numbersWithoutDelimeter = numbers.substring(posNumbersBegin);
        String[] numbersString = numbersWithoutDelimeter.split(delimiter);
        return sum(numbersString);
    }

    /** */
    public String sumWithNegativeOnes(String numbers) {
        String[] numbersString = numbers.split(",");
        String negativeNumbers = "negatives not allowed ";
        for (String number : numbersString) {
            int numberInt = Integer.parseInt(number);
            if (numberInt < 0) {
                negativeNumbers += numberInt + ", ";
            }
        }
        return negativeNumbers;
    }

    /**
     * sum every number inside the array.
    */
    public int sumIntArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (!isNegative(number) && isUnderLimit(number)) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * @return a true if inputNumber is under or equal to LIMIT.
    */
    public boolean isUnderLimit(int inputNumber) {
        return inputNumber <= LIMIT;
    }

    /**
     * @return a true if inputNumber is negative number.
    */
    public boolean isNegative(int inputNumber) {
        return inputNumber < 0;
    }
}
