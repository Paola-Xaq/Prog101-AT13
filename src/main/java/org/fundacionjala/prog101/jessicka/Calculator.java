package org.fundacionjala.prog101.jessicka;

public class Calculator {
    public int sum(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersString = splitStringOfNumbersIntoArray(numbers);
        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public String[] splitStringOfNumbersIntoArray(String numbers) {
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
//            delimiter = String.valueOf(numbers.charAt(2));
//            delimiter = numbers.charAt(2) + "\n";
            String[] segments = numbers.split("\n");
            numbers = segments[1];
            delimiter = String.valueOf(segments[0].charAt(2));
        }
        String[] numbersString = numbers.split(delimiter);
        return  numbersString;
    }
}
