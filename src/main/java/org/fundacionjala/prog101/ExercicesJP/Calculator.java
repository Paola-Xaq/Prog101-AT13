package org.fundacionjala.prog101.ExercicesJP;

public class Calculator {

    /**
     * Method for sum numbers into a String .
     */
    public int add(final String numbers) {
        if (!numbers.isEmpty()) {
            String[] arrayNumbers = numbers.split(",");
            int sum = 0;
            for (String number : arrayNumbers) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
        return 0;
    }
}
