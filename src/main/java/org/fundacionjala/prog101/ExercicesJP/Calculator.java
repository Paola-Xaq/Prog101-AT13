package org.fundacionjala.prog101.ExercicesJP;

public class Calculator {

    /**
     * Method for sum numbers into a String .
     */
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n");
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }
        String[] arrayNumbers = numbers.split(delimiter);
        int sum = 0;
        for (String number : arrayNumbers) {
            sum += Integer.parseInt(number);
        }
        return sum;

    }
}
