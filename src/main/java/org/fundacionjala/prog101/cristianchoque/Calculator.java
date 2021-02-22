package org.fundacionjala.prog101.cristianchoque;

public class Calculator {

    /**
     * Main method to parse the received array
     * @param numbers
     * @return Zero if String is empty
     */
    public int add(final String numbers) {
        String[] numbersString;
        if (!numbers.isEmpty()) {
            if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
                String[] stringNumbersAndDelimiter;
                char delimiter;
                String stringNumbersWithOtherDelimiters;
                stringNumbersAndDelimiter = numbers.split("\n");
                delimiter = stringNumbersAndDelimiter[0].charAt(stringNumbersAndDelimiter[0].length() - 1);
                stringNumbersWithOtherDelimiters = stringNumbersAndDelimiter[1];

                String onlyNumbersWithComas = replaceCaracterIntoString(stringNumbersWithOtherDelimiters, delimiter);
                numbersString = onlyNumbersWithComas.split(",");
                return resultAdd(numbersString);
            } else {
                String onlyNumbersWithComas = replaceJumpLineIntoString(numbers);
                numbersString = onlyNumbersWithComas.split(",");
                return resultAdd(numbersString);
            }
        }
        return 0;
    }

    /**
     * Method for add only numbers
     * @param arrayNumbers
     * @return result of the add
     */
    public int resultAdd(final String[] arrayNumbers) {
        int addNumbers = 0;
        for (String number : arrayNumbers) {
            addNumbers += Integer.parseInt(number);
        }
        return addNumbers;
    }

    /**
     * Method to replace \n to coma into the string
     * @param stringNumbers
     * @return string with only Numbers and comas
     */
    public String replaceJumpLineIntoString(final String stringNumbers) {
        String onlyNumbersWithComas;
        String jumpLine = System.getProperty("line.separator");
        onlyNumbersWithComas = stringNumbers;
        onlyNumbersWithComas = onlyNumbersWithComas.replace(jumpLine, ",");
        return onlyNumbersWithComas;
    }

    /**
     * Method to replace delimiter to coma into the string
     * @param stringNumbers
     * @param delimiter
     * @return string with only Numbers and comas
     */
    public String replaceCaracterIntoString(final String stringNumbers, final char delimiter) {
        String onlyNumbersWithComas;
        onlyNumbersWithComas = stringNumbers;
        onlyNumbersWithComas = onlyNumbersWithComas.replace(String.valueOf(delimiter), ",");
        return onlyNumbersWithComas;
    }

}
