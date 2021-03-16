package org.fundacionjala.prog101.Examen;

public class Product {
    private String name;
    private int price;
    private int amount;
    private int partialTotal;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, int price, int amountProd) {
        this.name = name;
        this.price = price;
        this.amount = amountProd;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public int calculatePartialTotal(){
        if (amount >= 1) {
            partialTotal = amount * price;
            return partialTotal;
        }
        return partialTotal = 0;

    }

    public String getInfoProduct() {
        return amount + "    " + name + " " + "-" + " " + price + "     " + partialTotal;
    }

}
