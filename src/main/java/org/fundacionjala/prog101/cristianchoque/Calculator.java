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
                String[] delimiterAndNumbers = separateNumbersAndDelimiters(numbers);
                String[] delimiters = getDelimiters(delimiterAndNumbers[0]);
                String onlyNumbersWithComas = replaceCaracterIntoString(delimiterAndNumbers[1], delimiters);
                System.out.println(onlyNumbersWithComas);
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
        final int bigNumbers = 1000;
        int addNumbers = 0;
        for (String number : arrayNumbers) {
            if (Integer.parseInt(number) <= bigNumbers) {
                addNumbers += Integer.parseInt(number);
            }
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
    public String replaceCaracterIntoString(final String stringNumbers, final String[] delimiter) {
        String onlyNumbersWithComas;
        onlyNumbersWithComas = stringNumbers;
        int countDelimiters = getCountDelimiters(delimiter);
        for (int i = 0; i < countDelimiters; i++) {
            onlyNumbersWithComas = onlyNumbersWithComas.replace(delimiter[i], ",");
        }
        return onlyNumbersWithComas;
    }

    /**
     *
     * @param delimiter
     * @return count of the delimiters
     */
    public int getCountDelimiters(final String[] delimiter) {
        int cont = 0;
        for (int j = 0; j < delimiter.length; j++) {
            if (delimiter[j] != null) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * This method is for separate the delimiters and Numbers
     * @param stringNumbersDelimiters
     * @return array with delimiters and Numbers
     */
    public String[] separateNumbersAndDelimiters(final String stringNumbersDelimiters) {
        String[] stringNumbersAndDelimiter;
        stringNumbersAndDelimiter = stringNumbersDelimiters.split("\n");
        return stringNumbersAndDelimiter;
    }

    /**
     * this method get all the delimiters in an array
     * @param delimiters
     * @return array the all the delimiters
     */
    public String[] getDelimiters(final String delimiters) {
        final int sizeDelimiterArray = 10;
        final int sizeWithOneDelimiter = 3;
        String[] delimitersArray = new String[sizeDelimiterArray];
        if (delimiters.length() == sizeWithOneDelimiter) {
            delimitersArray[0] = String.valueOf(delimiters.charAt(delimiters.length() - 1));
            return delimitersArray;
        } else {
            int j = 0;
            for (int i = sizeWithOneDelimiter; i < delimiters.length(); i = i + sizeWithOneDelimiter) {
                delimitersArray[j] = String.valueOf(delimiters.charAt(i));
                j++;
            }
            return delimitersArray;
        }
    }
}
