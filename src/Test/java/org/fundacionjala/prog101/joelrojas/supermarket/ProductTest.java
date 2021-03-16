package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;
import static org.junit.Assert.*;
public class ProductTest {
    @Test
    public void testCorrectPrice() {
        Product product = new Product("Sausage", 17);
        int expectedPrice = 17;
        int actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testWithoutMeasurementUnit() {
        Product product = new Product("Meat", 33);
        String expectedMeasurementUnit = "";
        String actualMeasurementUnit = product.getUnitOfMeasurement();
        assertEquals(expectedMeasurementUnit, actualMeasurementUnit);
    }

    @Test
    public void testWithMeasurementUnit() {
        Product product = new Product("Meat", 33, "kg");
        String expectedMeasurementUnit = "kg";
        String actualMeasurementUnit = product.getUnitOfMeasurement();
        assertEquals(expectedMeasurementUnit, actualMeasurementUnit);
    }

    @Test
    public void testToString() {
        Product product = new Product("Meat", 33, "kg");
        String expected = "Meat           $33       ";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}
