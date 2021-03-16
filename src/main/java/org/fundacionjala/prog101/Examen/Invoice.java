package org.fundacionjala.prog101.Examen;

import java.util.ArrayList;

public class Invoice {
    private int totalCost = 0;
    private int prodPrice = 0;
    private int prodAmount = 0;
    private int partialTotal = 0;
    public ArrayList<Product> prod;

    public Invoice(ArrayList<Product> products) {
        this.prod = products;
    }

    public int totalCost() {
        if (!prod.isEmpty()) {
            for (int i = 0; i < prod.size(); i++) {
                    prodAmount = prod.get(i).getAmount();
                    prodPrice = prod.get(i).getPrice();
                    partialTotal = prod.get(i).calculatePartialTotal();
                if(prod.get(i).getPromo()) {
                    totalCost += prodAmount * prodPrice * 0.90;
                }else{
                    totalCost += prodAmount * prodPrice;
                }

            }
        }
        return totalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public ArrayList<Product> getProd() {
        return prod;
    }

    public String create() {
        String creation = "";
        String title = "Cant   Prod  Price TOTAL";
        String dividedLine1 = "-----------------------";
        System.out.println(title);
        System.out.println(dividedLine1);
        for (int i = 0; i < prod.size(); i++) {
            creation += prod.get(i).getInfoProduct();
            System.out.println(prod.get(i).getInfoProduct());
        }
        String dividedLine = "-----------------------";
        System.out.println(dividedLine);
        String totalLine = "Total" + "                " + getTotalCost();
        System.out.println(totalLine);
        return creation;
    }
}
