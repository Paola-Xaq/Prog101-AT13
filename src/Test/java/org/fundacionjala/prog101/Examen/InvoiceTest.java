package org.fundacionjala.prog101.Examen;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InvoiceTest {

    @Test
    public void totalCostNoProductsAdded() {
        ArrayList<Product> prod = new ArrayList<>();
        Invoice invoice = new Invoice(prod);
        int expected = 0;
        int actual = invoice.totalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void totalCostTwoProductsAdded() {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("Bread", 1, 2));
        prod.add(new Product("Milk", 5, 3));
        prod.add(new Product("Milk", 5, 1));
        Invoice invoice = new Invoice(prod);
        int expected = 22;
        int actual = invoice.totalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalCost() {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("Bread", 1, 2));
        prod.add(new Product("Milk", 5, 3));
        Invoice invoice = new Invoice(prod);
        invoice.totalCost();
        int expected = 17;
        int actual = invoice.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void create() {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("Bread", 1, 1));
        prod.add(new Product("Milk", 5, 2));
        Invoice invoice = new Invoice(prod);
        invoice.totalCost();
        String expected = "1    Bread - 1     12    Milk - 5     10";
        String actual = invoice.create();
        assertEquals(expected, actual);
    }
}