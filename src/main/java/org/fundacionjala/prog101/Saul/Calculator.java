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

    /**
     * Method to split a String into an array of int.
     * @param numbers.
     * @return the array of int.
     */
    public int[] split(final String numbers) {
        String[]stringRes = numbers.split("\n|,");
        int[]intRes = new int[stringRes.length];
        for (int pos = 0; pos < intRes.length; pos++) {
            intRes[pos] = Integer.parseInt(stringRes[pos]);
        }
        return intRes;
    }
}
