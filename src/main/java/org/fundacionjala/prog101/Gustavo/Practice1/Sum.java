package org.fundacionjala.prog101.Gustavo.Practice1;

import java.util.ArrayList;

public class Sum {
    Sum() {
    }

    /**
     * @return an result of total sum.
     */
    public int caculation(final String nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        /*String[] numbersString = nums.split(",");
        int sum = 0;

        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }*/
        int result = caculationSum(selectNumber(nums));
        return result;
    }

    /**
     * Select only numbers
     * @return an ArrayList<String> that has only number.
     */
    public ArrayList<String> selectNumber(final String nums) {
        char[] something = nums.toCharArray();
        //String[] number = new String[something.length];
        //int numberIndice = 0;
        ArrayList<String> number = new ArrayList<String>();
        String numero = "";
        for (int i = 0; i < something.length; i++) {
            if (something[i] >= '0' && something[i] <= '9' || something[i] == '-') {
                numero = numero + something[i];
            } else {
                //number[numberIndice] = numero;
                //numberIndice += 1;
                number.add(numero);
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
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}

