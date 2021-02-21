package org.fundacionjala.prog101.cristianchoque;

public class Calculator {

    /**
     * Method for add numbers
     * @param numbers
     * @return Zero if String is empty
     */
    public int add(final String numbers) {
        String[] numbersString = numbers.split(",");
        int addNumbers = 0;
        if (!numbers.isEmpty()) {
            for (String number : numbersString) {
                addNumbers += Integer.parseInt(number);
            }
            return addNumbers;
        }
        return 0;
    }

}
