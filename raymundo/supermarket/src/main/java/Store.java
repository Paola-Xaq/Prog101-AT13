import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Product> productArrayList = new ArrayList<>();
    private ArrayList<InvoiceDetail> invoiceDetails = new ArrayList<>();

    public void addProduct(Product product) {
        this.productArrayList.add(product);
    }
    /**
     * Shows the list of all the products on the store with its prices
     */
    public void printProducts() {
        int counter = 1;
        System.out.println("# Product Price");
        for (Product product : productArrayList) {
            System.out.println(counter + ".- " + product.getName() + " " + product.getPrice());
            counter += 1;
        }
    }

    /**
     * Creates the invoice
     * @return the invoice
     */
    public Invoice createInvoice() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceDetails(invoiceDetails);
        return invoice;
    }

    /**
     * Add products to the invoice detail
     * @param product a product to buy
     * @param quantity quantity to buy
     */
    public void buy(Product product, int quantity) {
        InvoiceDetail invoiceDetail = new InvoiceDetail(product, quantity);
        invoiceDetails.add(invoiceDetail);
    }
}
