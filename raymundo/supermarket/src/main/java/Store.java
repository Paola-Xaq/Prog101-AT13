import java.util.ArrayList;

public class Store {
    private ArrayList<InvoiceDetail> invoiceDetails = new ArrayList<>();

    public Invoice createInvoice() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceDetails(invoiceDetails);
        return invoice;
    }

    public void buy(Product product, int quantity) {
        InvoiceDetail invoiceDetail = new InvoiceDetail(product, quantity);
        invoiceDetails.add(invoiceDetail);
    }
}
