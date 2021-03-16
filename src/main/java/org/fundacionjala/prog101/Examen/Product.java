package org.fundacionjala.prog101.Examen;

public class Product {
    private String name;
    private int price;
    private int amount;
    private String unit;
    private int partialTotal;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        amount = 1;
    }

    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product(String name, int price, int amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
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
        return amount + " " + unit + "    " + name + " " + "-" + " " + price + "     " + partialTotal;
    }

}
