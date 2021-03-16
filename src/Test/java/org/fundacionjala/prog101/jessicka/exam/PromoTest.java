package org.fundacionjala.prog101.jessicka.exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class PromoTest {

    @Test
    public void setPromo_100_10() {
        Promo promo = new Promo(100, 10);
        int expected = 10;
        int actual = promo.setPromo();
        assertEquals(expected, actual);
    }

    @Test
    public void getPercentageDiscount_10_10() {
        Promo promo = new Promo(100, 10);
        int expected = 10;
        int actual = promo.getPercentageDiscount();
        assertEquals(expected, actual);
    }
}