package org.fundacionjala.prog101.Excercies_Jorge.Calculadora;
public class StringCalculator {
    private final int delimiterSpecial = 3;
    /**
     * Method to sum numbers in a String
     * */
    public int add(final String numsToSum) {
        if (numsToSum.isEmpty()) {
            return 0;
        }
        String[] arrayofNumbers = getArrayOfNums(numsToSum);
        String negativeNumbers = getNegatives(arrayofNumbers);
        if (negativeNumbers.equals("Negatives are :")) {
            return sumNums(arrayofNumbers);
        } else {
            throw new IllegalArgumentException("negatives not allowed " + negativeNumbers);
        }

    }
    /**
     * Method to convert to Arrays to a String
     * */
    public String[] getArrayOfNums(final String nums) {
        String delimiter = "";
        String[] arrayStringNumbers;
        if (hasDelimiter(nums)) {
            delimiter = getDelimiter(nums);
            arrayStringNumbers = nums.split("\n");
            return arrayStringNumbers[1].split(delimiter);
        } else {
            delimiter = ",|\n";
            return nums.split(delimiter);
        }
    }
    /**
     * Method that says if a String has a special delimiter
     * */
    public boolean hasDelimiter(final String limiter) {
        return limiter.startsWith("//");
    }
    /**
     * Method that returns the delimiter
     * */
    public String getDelimiter(final String limiter) {
        return limiter.substring(2, delimiterSpecial);
    }
    /**
     * Method to sum numbers in a array of Strings
     * */
    public int sumNums(final String[] nums) {
        int sum = 0;
        final int maxLimit = 1000;
        for (String number : nums) {
            int num = Integer.parseInt(number);
            if (num <= maxLimit) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
    /**
     * Method to take notes of negative numbers
     * */
    public String getNegatives(final String[] numbers) {
        String negativesNumbers = "Negatives are :";
        for (String negative : numbers) {
            int num = Integer.parseInt(negative);
            if (num < 0) {
                negativesNumbers = negativesNumbers + " " + negative;
            }
        }
        return negativesNumbers;
    }
}
