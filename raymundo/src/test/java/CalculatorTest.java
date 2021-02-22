import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add_EmptyString_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NumberOneOnly_One() {
        Calculator calculator = new Calculator();
        int expected = 1;
        int actual = calculator.add("1");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NumbersOneAndTwo_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("1,2");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NumbersOneTwoAndThreeWithNewLineDelimiter_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NumbersOneTwoWithDifferentDelimiter_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        String delimiter = ";";
        int actual = calculator.add("//" + delimiter + "\n1" + delimiter + "2");
        assertEquals(expected, actual);
    }

    @Test
    public void add_NegativeOneAndTwo_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("1,2,-1");
        assertEquals(expected, actual);
    }

    @Test
    public void add_TwoAndAThousandAndOne_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.add("2,1001");
        assertEquals(expected, actual);
    }

    @Test
    public void add_OneTwoAndThreeWithDoubleDelimiter_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("//[--]\n1--2--3");
        assertEquals(expected, actual);
    }
}