public class InvoiceDetail {
    private int quantity;
    private Product product;
    private double total;
    private double promotion;
    InvoiceDetail (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        if (quantity >= product.getQuantityForPromotion()) {
            this.total = product.getPromotionPrice() * quantity;
        } else {
            this.total = product.getPrice() * quantity;
        }
    }

    /**
     * Gets the total value of the invoice detail (Step 1)
     * @return the total value
     */
    public double getTotal() {
        return total;
    }

    /**
     * Displays the products by name and unit price (Step 2)
     * @return a string with the name and price
     */
    public String showProductAndUnitPrice() {
        return "" + product.getName() + " - " + product.getPrice();
    }

    /**
     * Displays the products, the quantity, its price and the total (step 3)
     * @return a string with the mentioned data
     */
    public String showFullInvoiceDetail() {
        return "" + quantity + " " + showProductAndUnitPrice() + " " + total;
    }

    /**
     * Displays the products, its unit measurement, the quantity, its price and the total (step 4)
     * @return a string with the mentioned data
     */
    public String showFullInvoiceDetailWithUnitOfMeasurement() {
        return "" + quantity + " "+ product.getUnitOfMeasurement() + " " + showProductAndUnitPrice() + " " + total;
    }

    /**
     * Displays the products, its unit measurement, the quantity, its price, the promotion and the total (step 5)
     * @return
     */
    public String showCompleteInvoiceDetail() {
        if (quantity >= product.getQuantityForPromotion()) {
            return "" + quantity + " "+ product.getUnitOfMeasurement() + " " + showProductAndUnitPrice() + " " + product.getPromotionPercentage() + " " + String.format("%.1f",total);
        } else {
            return "" + quantity + " "+ product.getUnitOfMeasurement() + " " + showProductAndUnitPrice() + " " + "0.0%" + " " + String.format("%.1f",total);
        }
    }
}
