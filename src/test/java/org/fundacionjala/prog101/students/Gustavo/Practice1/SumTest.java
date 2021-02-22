package org.fundacionjala.prog101.students.Gustavo.Practice1;

import org.junit.Test;

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
}