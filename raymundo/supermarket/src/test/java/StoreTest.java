import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1), 1);
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1),1);
        store.buy(new Product("milk", 10),1);
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetUnitPriceOnEmptyInvoice() {
        Store store = new Store();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = store.createInvoice().getProductAndUnitFromInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetOneProductUnitPriceFromInvoice() {
        Store store = new Store();
        store.buy(new Product("milk", 10), 1);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("milk - 10");
        ArrayList<String> actual = store.createInvoice().getProductAndUnitFromInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTwoProductUnitPriceFromInvoice() {
        Store store = new Store();
        store.buy(new Product("milk", 10), 1);
        store.buy(new Product("bread", 1), 1);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("milk - 10");
        expected.add("bread - 1");
        ArrayList<String> actual = store.createInvoice().getProductAndUnitFromInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFullInvoiceDetailOnEmptyInvoice() {
        Store store = new Store();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetOneProductFullInvoiceDetail() {
        Store store = new Store();
        store.buy(new Product("milk", 10), 2);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2 milk - 10 20.0");
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTwoProductsFullInvoiceDetail() {
        Store store = new Store();
        store.buy(new Product("milk", 10), 2);
        store.buy(new Product("bread", 1), 3);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2 milk - 10 20.0");
        expected.add("3 bread - 1 3.0");
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFullInvoiceDetailOnEmptyInvoiceWithUnitOfMeasurement() {
        Store store = new Store();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetailWithUnitOfMeasurement();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetOneProductFullInvoiceDetailWithUnitOfMeasurement() {
        Store store = new Store();
        store.buy(new Product("milk", 10, "lt"), 2);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2 lt milk - 10 20.0");
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetailWithUnitOfMeasurement();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetThreeProductsFullInvoiceDetailWithUnitOfMeasurement() {
        Store store = new Store();
        store.buy(new Product("milk", 10, "lt"), 2);
        store.buy(new Product("bread", 1, "u"), 3);
        store.buy(new Product("rice",5, "kg"), 5);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2 lt milk - 10 20.0");
        expected.add("3 u bread - 1 3.0");
        expected.add("5 kg rice - 5 25.0");
        ArrayList<String> actual = store.createInvoice().getFullInvoiceDetailWithUnitOfMeasurement();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFourProductsCompleteInvoiceDetail() {
        Store store = new Store();
        store.buy(new Product("milk", 10, "lt",45, 5), 5);
        store.buy(new Product("bread", 1, "u", 9, 10), 10);
        store.buy(new Product("rice",5, "kg", 90, 20), 20);
        store.buy(new Product("oil",10, "lt", 90, 10), 10);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("5 lt milk - 10 10.0% 45.0");
        expected.add("10 u bread - 1 10.0% 9.0");
        expected.add("20 kg rice - 5 10.0% 90.0");
        expected.add("10 lt oil - 10 10.0% 90.0");
        ArrayList<String> actual = store.createInvoice().getCompleteInvoice();
        assertEquals(expected, actual);
    }
}