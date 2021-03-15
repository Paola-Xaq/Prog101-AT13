package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class ItemInvoice {

    private int cant;
    private Product product;

    public ItemInvoice(int cant, Product product) {
        this.cant = cant;
        this.product = product;
    }

    public int getCant() {
        return cant;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "ItemFactura{" +
                "cant=" + cant +
                ", product=" + product +
                '}';
    }

    public int getTotalCost(){
        return this.cant * this.product.getPrice();
    }


}
