package org.fundacionjala.prog101.PaolaAguilar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum_EmptyString_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.sum("");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OnlyNumberOne_One() {
        Calculator calculator = new Calculator();
        int expected = 1;
        int actual = calculator.sum("1");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_NumberOnePlusNumberTwo_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sum("1,2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_EmptyNumberAndTwo_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.sum(",2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_TwoAndEmptyNumber_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.sum("2,");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OneNewLineTwoPlusTwo_Five() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.sum("1\n2,2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OnePlusTwoNewLineTwo_Five() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.sum("1,2\n2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OnePlusTwoChangingDelimiter_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sum("//;\n1;2");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_NegativeTwoAndOne_ThrowException() {
        Calculator calculator = new Calculator();
        String expected = "Negatives not allowed -2,";
        int actual = calculator.sum("-2,1");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_TwoAndNegativeOne_ThrowException() {
        Calculator calculator = new Calculator();
        String expected = "Negatives not allowed -2,";
        int actual = calculator.sum("2,-1");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_EmptyAndNegativeOne_ThrowException() {
        Calculator calculator = new Calculator();
        String expected = "Negatives not allowed -1,";
        int actual = calculator.sum(",-1");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_ManyNegatives_ThrowException() {
        Calculator calculator = new Calculator();
        String expected = "Negatives not allowed -5,-7,-1";
        int actual = calculator.sum("-5\n-7,-1");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_BigNumberPlusOne_One() {
        Calculator calculator = new Calculator();
        int expected = 1;
        int actual = calculator.sum("1001,1");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_BigNumbersPlusOnePlus5_One() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("//;1001\n4000;1\n5");
        assertEquals(expected, actual);
    }
}