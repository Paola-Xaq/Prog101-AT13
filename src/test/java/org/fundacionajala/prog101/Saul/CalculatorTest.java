package org.fundacionjala.prog101.Saul;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add_NumberOnePlusNumberTwo_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("1,2");
        assertEquals(expected, actual);
    }
    @Test
    public void add_EmptyString_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void add_EmptyNumberAndTwo_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.add(",2");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NumberNegativeTwoAndOne_NegativeOne() {
        Calculator calculator = new Calculator();
        int expected = -1;
        int actual = calculator.add("-2,1");
        assertEquals(expected, actual);
    }
    @Test
    public void split_StringWithNewLines_returnExpectedArray() {
        Calculator calculator = new Calculator();
        int[]expected = {1,2,3};
        int[] actual = calculator.split("1\n2,3");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void getDelimiter_StringWithDelimiterBetweenBrackets_returnDelimiter() {
        Calculator calculator = new Calculator();
        String[]expected = {"+"};
        String[]actual = calculator.getDelimiters("//[+]\n2,3");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void getDelimiter_StringWithMultipleDelimiters_returnDelimiters() {
        Calculator calculator = new Calculator();
        String[]expected = {"+","-"};
        String[]actual = calculator.getDelimiters("//[+][-]\n2,3");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void getDelimiter_StringWithDelimiterOfVariousChars_returnDelimiters() {
        Calculator calculator = new Calculator();
        String[]expected = {"++","--"};
        String[]actual = calculator.getDelimiters("//[++][--]\n2,3");
        assertArrayEquals(expected, actual);
    }
}
