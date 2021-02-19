package org.fundacionjala.prog101.sumTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.fundacionjala.prog101.calculator.*;

public class ExampleTest {

    @Test
    public void sumTwoNumbers_SendTwoNumbers_ExpectYourSum() {

        Sum instance = new Sum();
        final int NUMBER_1 = 3;
        final int NUMBER_2 = 5;
        final int EXPECTED = 8;
        int result = instance.sumTwoNumbers(NUMBER_1, NUMBER_2);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumTwoNumbers_SendTwoNumbersNegatives_ExpectYourSum() {

        Sum instance = new Sum();
        final int NUMBER_1 = -5;
        final int NUMBER_2 = -7;
        final int EXPECTED = -12;
        int result = instance.sumTwoNumbers(NUMBER_1, NUMBER_2);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumTwoNumbers_SendTwoNumbersOnePositiveAndOneNegatives_ExpectYourSum() {

        Sum instance = new Sum();
        final int NUMBER_1 = 3;
        final int NUMBER_2 = -5;
        final int EXPECTED = -2;
        int result = instance.sumTwoNumbers(NUMBER_1, NUMBER_2);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumTwoNumbers_SendTwoNumbers0_ExpectYourSum() {

        Sum instance = new Sum();
        final int NUMBER_1 = 0;
        final int NUMBER_2 = 0;
        final int EXPECTED = 0;
        int result = instance.sumTwoNumbers(NUMBER_1, NUMBER_2);
        assertEquals(EXPECTED, result);
    }

}