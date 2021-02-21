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
            numbersString = numbers.split(",");
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

}
