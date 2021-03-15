package org.fundacionjala.prog101.jessicka.exam;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getPrice_One_One() {
        Product product = new Product("bread", 1);
        int actual = product.getPrice();
        assertEquals(1, actual);
    }

    @Test
    public void getName_Bread_Bread() {
        Product product = new Product("bread", 1);
        String actual = product.getName();
        assertEquals("bread", actual);
    }
}