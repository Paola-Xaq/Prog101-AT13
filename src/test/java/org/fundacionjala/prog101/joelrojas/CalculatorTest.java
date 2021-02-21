package org.fundacionjala.prog101.joelrojas;
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
        int actual = calculator.sum("2");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_NumberNegativeTwoAndOne_NegativeOne() {
        Calculator calculator = new Calculator();
        int expected = -1;
        int actual = calculator.sum("-2,1");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OneTwoAndThreeWithNewLineBetween_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void sum_OneTwoAndWithDifferentDelimeter_Six() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sumWithDelimiter("//;\n1;2");
        assertEquals(expected, actual);
    }
}