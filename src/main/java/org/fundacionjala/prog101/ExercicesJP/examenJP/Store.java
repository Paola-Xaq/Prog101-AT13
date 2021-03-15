package org.fundacionjala.prog101.ExercicesJP.examenJP;

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

    public int totalCost() {
        int total = 0;
        if( items==null) return total;
        for (ItemInvoice item : this.items) {
            total = total + item.getTotalCost();
        }
        return total;
    }

    public String showDetail() {
        StringBuilder sb = new StringBuilder();
        for(ItemInvoice item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item.getProduct().getName())
                    .append("\t")
                    .append("-")
                    .append("\t")
                    .append("\t")
                    .append("$")
                    .append(item.getProduct().getPrice())
                    .append("\n");
        }
        sb.append("---------------------");
        sb.append("\nTotal").append("\t\t\t").append("$").append(totalCost());
        return sb.toString();
    }
}


