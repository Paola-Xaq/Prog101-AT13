package org.fundacionjala.prog101.edsonAnawayaTest;
import static org.junit.Assert.*;

import org.fundacionjala.prog101.edsonAnawaya.practice1.calculator.Calculator;
import org.junit.Test;

public class calculatorTest {
    @Test
    public void add_EmptyNumbers_Zero(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "";
        final int EXPECTED = 0;
        int result = calculator.add(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbers_EmptyNumbers_Zero(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "";
        final int EXPECTED = 0;
        int result = calculator.sumNumbers(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbers_OnlyOneNumber_SameNumber(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "1";
        final int EXPECTED = 1;
        int result = calculator.sumNumbers(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbers_TwoNumbers_sumNumbers(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "1,2";
        final int EXPECTED = 3;
        int result = calculator.sumNumbers(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbers_MoreWhatTwoNumbers_sumAllNumbers(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "1,2,3,4,5";
        final int EXPECTED = 15;
        int result = calculator.sumNumbers(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbersWithLineJump_MoreWhatTwoNumbersWithSaltJump_sumAllNumbers(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "1\n2,3";
        final int EXPECTED = 6;
        int result = calculator.sumNumbersWithLineJump(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test
    public void sumNumbersWithCustomerDelimiter_DelimiterCustomerAndNumbers_sumAllNumbers(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "//;\n1;2";
        final int EXPECTED = 3;
        int result = calculator.sumNumbersWithCustomerDelimiter(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumNumbersWithoutNumbersNegatives_NumberPositivesAndNegatives_sumOnlyNumbersPositives(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "//;\n1;2;-1";
        final String EXPECTED = "Negatives not allowed :-1 ";
        int result = calculator.sumNumbersWithoutNumbersNegatives(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumNumbersLessThan1001_NumberPositivesAndGreaterThan1001_sumOnlyNumbersLessThan1000(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "//[—]\n1001—2—3";
        final int EXPECTED = 5;
        int result = calculator.sumNumbersWithoutNumbersNegatives(NUMBERS);
        assertEquals(EXPECTED, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumNumbersWithMultiplesDelimiters_NumbersWithMultiplesDelimiter_sumAllNumbers(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "//[-][%]\n1-2%3";
        final int EXPECTED = 6;
        int result = calculator.sumNumbersWithoutNumbersNegatives(NUMBERS);
        assertEquals(EXPECTED, result);
    }
}
