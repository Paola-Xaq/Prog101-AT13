package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class InvoiceTest {
    @Test
    public void testTotalCostWithThreeProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12));
        products.add(new Product("Cookies", 6));
        products.add(new Product("Cheese", 5));
        ArrayList<Integer> amounts = new ArrayList<>();
        amounts.add(1);
        amounts.add(1);
        amounts.add(1);
        Invoice invoice = new Invoice(products, amounts);
        int expected = 23;
        int actual = invoice.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12));
        products.add(new Product("Cookies", 6));
        ArrayList<Integer> amounts = new ArrayList<>();
        amounts.add(1);
        amounts.add(1);
        Invoice invoice = new Invoice(products, amounts);
        String expected = "Cant      Product        Price     Total\n"
                + "----------------------------------------\n"
                + "1         Beer           $12       $12" + "\n"
                + "1         Cookies        $6        $6" + "\n"
                + "----------------------------------------\n"
                + "Total                              $18";
        String actual = invoice.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testAmountsOfProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12));
        products.add(new Product("Cookies", 6));
        ArrayList<Integer> amounts = new ArrayList<>();
        amounts.add(2);
        amounts.add(3);
        Invoice invoice = new Invoice(products, amounts);
        String expected = "Cant      Product        Price     Total\n"
                + "----------------------------------------\n"
                + "2         Beer           $12       $24" + "\n"
                + "3         Cookies        $6        $18" + "\n"
                + "----------------------------------------\n"
                + "Total                              $42";
        String actual = invoice.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testClompleteInformationOfProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Beer", 12, "l"));
        products.add(new Product("Cookies", 6, "kg"));
        ArrayList<Integer> amounts = new ArrayList<>();
        amounts.add(2);
        amounts.add(3);
        Invoice invoice = new Invoice(products, amounts);
        String expected = "Cant      Product        Price     Total\n"
                + "----------------------------------------\n"
                + "2 l       Beer           $12       $24" + "\n"
                + "3 kg      Cookies        $6        $18" + "\n"
                + "----------------------------------------\n"
                + "Total                              $42";
        String actual = invoice.toString();
        assertEquals(expected, actual);
    }

}
