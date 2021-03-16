package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product("bread",1,"u");
        Product producto2 = new Product("milk",10,"lt");
        Product producto3 = new Product("oil",10,"lt");
        Product producto4 = new Product("rice",5,"kg");


        ItemInvoice[] items = {
                new ItemInvoice(10,producto1),
                new ItemInvoice(5,producto2),
                new ItemInvoice(10,producto3),
                new ItemInvoice(20,producto4)
        };

        Store invoice = new Store();
        invoice.buy(items);
        invoice.setItems(items);  ;

        System.out.println(invoice.showDetail());

    }
}
