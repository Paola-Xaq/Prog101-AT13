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
        return promotions(this.product.getName(), this.cant*this.product.getPrice());
    }

    public int promotions(String name,int price){
        int aux = price;
        int discount = 0;
        if(name.equals("bread") && cant > 9){
            discount = price - (int)(price*0.1);
        } else if(name.equals("milk") && cant > 4){
            discount = price - (int)(price*0.1);
        } else if(name.equals("oil") && cant > 9){
            discount = price - (int)(price*0.1);
        }else if(name.equals("rice") && cant > 19) {
            discount = price - (int)(price*0.1);
        }else {
            discount = price;
        }
        return discount;
    }

}
