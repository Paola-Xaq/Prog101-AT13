package org.fundacionjala.prog101.Gustavo.Practice1;

import java.util.ArrayList;

public class Sum {
    static final int MAX_NUMBER = 1000;

    Sum() {
    }

    /**
     * @return an result of total sum.
     */
    public int caculation(final String nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        return caculationSum(selectNumber(nums));
    }

    /**
     * Select only numbers
     *
     * @return an ArrayList<String> that has only number.
     */
    public ArrayList<String> selectNumber(final String nums) {
        char[] something = nums.toCharArray();
        ArrayList<String> number = new ArrayList<String>();
        String numero = "";
        for (int i = 0; i < something.length; i++) {
            if (something[i] >= '0' && something[i] <= '9' || something[i] == '-') {
                numero = numero + something[i];
            } else {
                if (numero != "") {
                    number.add(numero);
                }
                numero = "";
            }
        }
        number.add(numero);
        return number;
    }

    /**
     * @return an integer that is the total sum.
     */
    private int caculationSum(final ArrayList<String> numbersString) {
        int sum = 0;

        for (String number : numbersString) {
            if (number.isEmpty()) {
                return 0;
            }
            try {
                if (Integer.parseInt(number) >= 0) {
                    if (Integer.parseInt(number) < MAX_NUMBER) {
                        sum += Integer.parseInt(number);
                    }
                } else {
                    negativeNumber(number);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return sum;
    }

    /**
     * @return throw expection.
     */
    private void negativeNumber(final String numeber) {
        throw new IllegalArgumentException("Negatives not allowed " + numeber);
    }
}

