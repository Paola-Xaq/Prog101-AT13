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
        prod.add(new Product("Bread", 1));
        prod.add(new Product("Milk", 5));
        prod.add(new Product("Milk", 5));
        Invoice invoice = new Invoice(prod);
        int expected = 11;
        int actual = invoice.totalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void getTotalCost() {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("Bread", 1));
        prod.add(new Product("Milk", 5));
        Invoice invoice = new Invoice(prod);
        invoice.totalCost();
        int expected = 6;
        int actual = invoice.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void create() {
        ArrayList<Product> prod = new ArrayList<>();
        prod.add(new Product("Bread", 1));
        prod.add(new Product("Milk", 5));
        Invoice invoice = new Invoice(prod);
        invoice.totalCost();
        String expected = "Bread -- 1Milk -- 5";
        String actual = invoice.create();
        assertEquals(expected, actual);
    }
}