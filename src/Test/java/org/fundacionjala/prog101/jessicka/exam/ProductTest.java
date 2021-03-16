package org.fundacionjala.prog101.jessicka.exam;

import org.fundacionjala.prog101.jessicka.exam.categories.Food;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getPrice_One_One() {
        Product product = new Product("bread", 1, 2, new Food());
        int actual = product.getPrice();
        assertEquals(1, actual);
    }

    @Test
    public void getName_Bread_Bread() {
        Product product = new Product("bread", 1, 4, new Food());
        String actual = product.getName();
        assertEquals("bread", actual);
    }

    @Test
    public void getQuantity_Bread_4() {
        Product product = new Product("bread", 1, 4, new Food());
        int actual = product.getQuantity();
        assertEquals(4, actual);
    }
}