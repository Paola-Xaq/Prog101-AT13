package org.fundacionjala.prog101.joelrojas;
public class Calculator {
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
    /** */
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
}
