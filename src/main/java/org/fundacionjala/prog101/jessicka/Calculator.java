package org.fundacionjala.prog101.jessicka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public int sum(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersString = splitStringOfNumbersIntoArray(numbers);
        String negativeNumbers = thereAreNegatives(numbersString);
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed" + negativeNumbers);
        }
        int sum = 0;
        final int upperLimit = 1000;
        for (String number : numbersString) {
            if (Integer.parseInt(number) <= upperLimit) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    public String[] splitStringOfNumbersIntoArray(String numbers) {
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            String[] segments = numbers.split("\n");
            numbers = segments[1];
            delimiter = segments[0];
            if (delimiter.startsWith("//[")) {
                String auxiliary = "";
                Pattern pattern = Pattern.compile("\\[(.*?)\\]", Pattern.DOTALL);
                Matcher matcher = pattern.matcher(delimiter);
                while (matcher.find()) {
                    auxiliary = auxiliary + new StringBuilder().append(matcher.group(1)).append("|").toString();
                }
                delimiter = "[" + auxiliary.substring(0, auxiliary.length() - 1) + "]";
            } else {
                delimiter = new StringBuilder().append("\\").append(segments[0].charAt(2)).toString();
            }
        }
        String[] numbersString = numbers.split(delimiter);
        return  numbersString;
    }

    public String thereAreNegatives(String[] numbersString)  {
        String negativeNumbers = "";
        for (String number : numbersString) {
            if (Integer.parseInt(number) < 0) {
                negativeNumbers = negativeNumbers + "," + number;
            }
        }
        return negativeNumbers;
    }
}
