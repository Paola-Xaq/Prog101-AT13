package org.fundacionjala.prog101.Gustavo.Practice1;

import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void caculation_FiveAndfour_Nine() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("5,4");
        int expected = 9;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_OnlyOneNumberTen_Ten() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("10");
        int expected = 10;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_Emply_Zero() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_SumSixNineFivefour_Twentyfour() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("6,9,5,4");
        int expected = 24;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_stringWithNewlineCommasAndNumber_six() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("1\n2,3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_stringWithNewlineCommasAndNumber_sixty() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("4,21\n32,3");
        int expected = 60;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_stringWithNewline_Zero() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("\n");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_stringWithNewlineCommasDelimiterAndNumber_three() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("//;\n1;2");
        int expected = 3;
        assertEquals(expected,actual);
    }
}