package org.fundacionjala.prog101.students.Gustavo.Practice1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void caculation_fiveAndfour_Nine() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("5,4");
        int expected = 9;
        assertEquals(expected,actual);
    }
    @Test
    public void caculation_onlyOneNumberTen_Ten() {
        Sum nums1 = new Sum();
        int actual = nums1.caculation("10");
        int expected = 10;
        assertEquals(expected,actual);
    }
}