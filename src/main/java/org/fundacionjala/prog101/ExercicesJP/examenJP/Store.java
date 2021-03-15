package org.fundacionjala.prog101.ExercicesJP.examenJP;

import org.fundacionjala.prog101.ExercicesJP.wrapperClass.Cliente;

import java.text.SimpleDateFormat;

public class Store {

    private ItemInvoice[] items;
    private int total;

    public Store() {
    }

    public void buy(ItemInvoice[] items) {
        this.items = items;
        this.total = 0;
    }



    public ItemInvoice[] getItems() {
        return items;
    }

    public void setItems(ItemInvoice[] items) {
        this.items = items;
    }

    public String showDetail() {
        return "\n" + invoiceDetail() + "TOTAL: \t\t" + totalCost();
    }

    public int totalCost() {
        int total = 0;
        if( items==null) return total;
        for (ItemInvoice item : this.items) {
            total = total + item.getTotalCost();
        }
        return total;
    }

    private String invoiceDetail() {
        String detail = "";
        System.out.println("Cant Product Price Total");
        System.out.println("-----------------------------");
        for (ItemInvoice item : this.items) {
            detail = detail + item.getCant()+" - \t  "+item.getProduct().getName()+"  - \t"+item.getProduct().getPrice()+" "+item.getTotalCost()+"\n";
        }
        System.out.println("-----------------------------");
        return detail;
    }


}


