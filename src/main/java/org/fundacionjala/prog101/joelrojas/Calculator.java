package org.fundacionjala.prog101.joelrojas;
public class Calculator {
    /** */
    public int sum(String numbers) {
        if (isEmpty(numbers)) {
            return 0;
        } else {
            String[] numbersString = numbers.split(",");
            int sum = sum(numbersString);
            return sum;
        }
    }
    /** */
    public int sum(String[] numbersString) {
        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
    /** */
    public boolean isEmpty(String numbers) {
        return numbers.equals("");

    }
}
