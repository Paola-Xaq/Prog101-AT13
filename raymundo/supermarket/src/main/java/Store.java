import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();

    public Invoice createInvoice() {
        Invoice invoice = new Invoice();
        invoice.setProductList(products);
        return invoice;
    }

    public void buy(Product product) {
        this.products.add(product);
    }
}
