package org.fundacionjala.prog101.edsonAnawaya;

public class Calculator {

    private static final int CHARACTER_CODE_0 = 48;
    private static final int CHARACTER_CODE_9 = 57;
    public Calculator() {
    }

    /**
     * Function empty return 0
     */
    public int add(final String numbers) {
        return 0;
    }

    /**
     * Function sum a string with number or numbers
     */
    public int sumNumbers(final String numbers) {
        if (numbers == "") {
            return 0;
        }
        String[] arrayStrings = numbers.split(",");
        int sumTotal = 0;
        for (String number : arrayStrings) {
            sumTotal += Integer.parseInt(number);
        }

        return sumTotal;
    }

    /**
     * Function sum a string with number or numbers with salt jump
     */
    public int sumNumbersWithLineJump(final String numbers) {
        if (numbers == "") {
            return 0;
        }
        int sumTotal = 0;
        String numberString = "";
        for (int i = 0; i < numbers.length(); i++) {
            if ((int) numbers.charAt(i) >= CHARACTER_CODE_0 && (int) numbers.charAt(i) <= CHARACTER_CODE_9) {
                numberString += numbers.charAt(i);
            } else {
                sumTotal += Integer.parseInt(numberString);
                numberString = "";
            }
        }
        if (numberString == "") {
            return sumTotal;
        }
        sumTotal += Integer.parseInt(numberString);
        return sumTotal;
    }
}
