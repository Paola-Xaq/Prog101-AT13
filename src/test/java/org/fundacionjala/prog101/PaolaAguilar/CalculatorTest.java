package org.fundacionjala.prog101.PaolaAguilar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum_NumberOnePlusNumberTwo_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sum("1,2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_EmptyString_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.sum("");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_EmptyNumberAndTwo_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.sum(",2");
        assertEquals(expected, actual);
    }

    /*@Test
    public void sum_NegativeTwoAndOne_ThrowException() {
        Calculator calculator = new Calculator();
        String expected = "ERROR";
        int actual = calculator.sum("-2,1");
        assertEquals(expected, actual);
    }*/
}