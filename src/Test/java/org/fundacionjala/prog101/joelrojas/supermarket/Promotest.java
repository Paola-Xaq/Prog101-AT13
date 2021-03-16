package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;
import static org.junit.Assert.*;
public class Promotest {
    @Test
    public void testNameOfANewPromo() {
        Promo promo = new Promo();
        promo.add(new Product("Sugar",12) , 20);
        String expectedName = "Sugar";
        String actualName = promo.getProducts().get(promo.getProducts().size() - 1).getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testAmountOfANewPromo() {
        Promo promo = new Promo();
        promo.add(new Product("Candies",12) , 15);
        int expectedAmount = 15;
        int actualAmount = promo.getAmounts().get(promo.getAmounts().size() - 1);
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void testIsNotProductInPromo() {
        Promo promo = new Promo();
        Product product = new Product("Candies",12);
        int amount = 10;
        boolean expected = false;
        boolean actual = promo.hasProm(product, amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsProductInPromo() {
        Promo promo = new Promo();
        Product product = new Product("Bread", 9);
        int amount = 10;
        boolean expected = true;
        boolean actual = promo.hasProm(product, amount);
        assertEquals(expected, actual);
    }
}
