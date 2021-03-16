package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product("bread",1,"u");
        Product producto2 = new Product("milk",10,"lt");
        Product producto3 = new Product("rice",5,"kg");


        ItemInvoice[] items = {
                new ItemInvoice(3,producto1),
                new ItemInvoice(2,producto2),
                new ItemInvoice(5,producto3)
        };


        ItemInvoice[] noproduct ={};

        Store invoice = new Store();
        invoice.buy(items);
        invoice.setItems(items);
        //System.out.println(invoice.showDetail());

        Store invoice1 = new Store();
        invoice1.buy(noproduct);
        invoice1.setItems(noproduct);
       // System.out.println(invoice1.showDetail());

        System.out.println(invoice.showDetail());

    }
}
