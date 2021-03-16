package org.fundacionjala.prog101.cristianchoque.examen;

public class Store {

    private Invoice invoice;

    public Store() {
        this.invoice = new Invoice();
    }

    /**
     *
     */
    public void buy(final int quantities, final Product product) {
        invoice.addProduct(quantities, product);
    }

    /**
     *
     * @return
     */
    public Invoice createInvoice() {
        return invoice;
    }
}
