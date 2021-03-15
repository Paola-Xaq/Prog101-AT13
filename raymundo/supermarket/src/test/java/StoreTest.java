import com.sun.jdi.ArrayReference;
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
        store.buy(new Product("bread", 1));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", 10));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetOneProductUnitPriceFromInvoice() {
        Store store = new Store();
        store.buy(new Product("milk", 10));
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(10);
        ArrayList<Integer> actual = store.createInvoice().getUnitPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTwoProductUnitPriceFromInvoice() {
        Store store = new Store();
        store.buy(new Product("milk", 10));
        store.buy(new Product("bread", 1));
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(1);
        ArrayList<Integer> actual = store.createInvoice().getUnitPrice();
        assertEquals(expected, actual);
    }
}