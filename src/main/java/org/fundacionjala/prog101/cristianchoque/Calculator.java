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

            String onlyNumbersWithComas = replaceCaracterIntoString(numbers);
            numbersString = onlyNumbersWithComas.split(",");
            return resultAdd(numbersString);
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
     * Method to replace caracteres into the string
     * @param stringNumeros
     * @return string with only Numbers and comas
     */
    public String replaceCaracterIntoString(final String stringNumeros) {
        String onlyNumbersWithComas;
        String jumpLine = System.getProperty("line.separator");
        onlyNumbersWithComas = stringNumeros;
        onlyNumbersWithComas = onlyNumbersWithComas.replace(jumpLine, ",");
        return onlyNumbersWithComas;
    }

}
