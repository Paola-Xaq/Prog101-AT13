public class InvoiceDetail {
    private int quantity;
    private Product product;
    private int total;
    InvoiceDetail (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.total = product.getPrice() * quantity;
    }

    public int getTotal() {
        return total;
    }

    public String showProductAndUnitPrice() {
        return "" + product.getName() + " - " + product.getPrice();
    }

    public String showFullInvoiceDetail() {
        return "" + quantity + " " + showProductAndUnitPrice() + " " + total;
    }

    public String showFullInvoiceDetailWithUnitOfMeasurement() {
        return "" + quantity + " "+ product.getUnitOfMeasurement() + " " + showProductAndUnitPrice() + " " + total;
    }
}
