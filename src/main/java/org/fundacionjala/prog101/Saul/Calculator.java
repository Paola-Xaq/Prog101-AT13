package org.fundacionjala.prog101.Saul;

public class Calculator {
    /**
     * Method to add numbers in a string.
     * @param numbers.
     * @return the sum of the numbers in the string.
     */
    public int add(final String numbers) {
        String[] numbersString = numbers.split(",");
        int sum = 0;
        System.out.println(numbersString.length);
            for (String number : numbersString) {
                if (!number.equals("")) {
                    sum += Integer.parseInt(number);
                }
            }
        return sum;
    }
}
