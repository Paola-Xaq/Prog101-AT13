package org.fundacionjala.prog101.students.Gustavo.Practice1;

public class Sum {
    Sum() {
    }

    /**
     * @return an integer that is the total sum.
     */
    public int caculation(final String nums) {
        String[] numbersString = nums.split(",");
        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}

