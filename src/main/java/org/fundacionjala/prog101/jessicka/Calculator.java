package org.fundacionjala.prog101.jessicka;

public class Calculator {
    public int sum(String numbers) {
        String[] numbersString = numbers.split(",");
        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
