package org.fundacionjala.prog101.ExercicesJP.examenJP;

import java.text.SimpleDateFormat;

public class Store {

    private ItemInvoice[] items;
    private int total;
    private Employee employee;

    public Store() {
    }

    public void buy(ItemInvoice[] items) {
        this.items = items;
        this.total = 0;
    }

    public Store(ItemInvoice[] items, int total, Employee employee) {
        this.items = items;
        this.total = total;
        this.employee = employee;
    }

    public ItemInvoice[] getItems() {
        return items;
    }

    public void setItems(ItemInvoice[] items) {
        this.items = items;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        sb.append("Cant\tProduct\t\t\tPrice\tTotal\n");
        sb.append("-------------------------------------\n");
        for(ItemInvoice item: this.items){
            sb.append(item.getCant())
                    .append(" ")
                    .append(item.getProduct().getType())
                    .append(" -  ")
                    .append("\t")
                    .append(item.getProduct().getName())
                    .append("\t-\t\t$")
                    .append(item.getProduct().getPrice())
                    .append("\t\t")
                    .append("$")
                    .append(item.getTotalCost())
                    .append("\n");
        }
        sb.append("-------------------------------------");
        sb.append("\nTotal").append("\t\t\t\t\t\t\t").append("$").append(totalCost());
        return sb.toString();
    }
}


