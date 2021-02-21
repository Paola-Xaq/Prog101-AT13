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
    public void sumWithDelimiter_OneTwoAndWithDifferentDelimeter_three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sumWithDelimiter("//;\n1;2");
        assertEquals(expected, actual);
    }

    @Test
    public void sumWithNegativeOnes_OneNegativeTwoAndThree_ExceptionWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        String expected = "negatives not allowed -2, ";
        String actual = calculator.sumWithNegativeOnes("1,-2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void sumIntArray_OneTwoThreeInArray_Six() {
        Calculator calculator = new Calculator();
        int[] inputNumbers = {1,2,3};
        int expected = 6; 
        int actual = calculator.sumIntArray(inputNumbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumIntArray_OneThousandTwoAndNegativeFiveAndFour_Four() {
        Calculator calculator = new Calculator();
        int[] inputNumbers = {1001,-5,4};
        int expected = 4; 
        int actual = calculator.sumIntArray(inputNumbers);
        assertEquals(expected, actual);
    }

    @Test
    public void isUnderLimit_TwentyOne_True() {
        Calculator calculator = new Calculator();
        int inputNumber = 21;
        boolean expected = true; 
        boolean actual = calculator.isUnderLimit(inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void isUnderLimit_OneThousandOne_False() {
        Calculator calculator = new Calculator();
        int inputNumber = 1001;
        boolean expected = false; 
        boolean actual = calculator.isUnderLimit(inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void isNegative_Negativefive_True() {
        Calculator calculator = new Calculator();
        int inputNumber = -5;
        boolean expected = true; 
        boolean actual = calculator.isNegative(inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void isNegative_Seven_False() {
        Calculator calculator = new Calculator();
        int inputNumber = 7;
        boolean expected = false; 
        boolean actual = calculator.isNegative(inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void separateNumberString_AStringWithOneTwoThree_StringArray() {
        Calculator calculator = new Calculator();
        String inputStringNumbers = "2,5,7";
        String delimiter = ",";
        String[] expected = {"2","5","7"}; 
        String[] actual = calculator.separateNumberString(inputStringNumbers, delimiter);
        assertEquals(expected, actual);
    }

    @Test
    public void sumWithDelimitersInBrackets_AStringWithDelimiterAndTwoFiveSeven_Fourteen() {
        Calculator calculator = new Calculator();
        String inputStringNumbers = "//[,]\n2,5,7";
        int expected = 14; 
        int actual = calculator.sumWithDelimitersInBrackets(inputStringNumbers);
        assertEquals(expected, actual);
    }
}