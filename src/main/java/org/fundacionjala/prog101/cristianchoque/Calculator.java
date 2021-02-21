package org.fundacionjala.prog101.cristianchoque;

public class Calculator {

    /**
     * Method for add numbers
     * @param numbers
     * @return Zero if String is empty
     */
    public int add(final String numbers) {
        if (!numbers.isEmpty()) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }

}
