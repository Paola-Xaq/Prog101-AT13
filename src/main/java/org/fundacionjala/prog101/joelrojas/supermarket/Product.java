package org.fundacionjala.prog101.joelrojas.supermarket;

public class Product {
    private String name;
    private int price;
    private String category;
    private String unitOfMeasurement;

    public Product(String nameP, int priceP) {
        this.name = nameP;
        this.price = priceP;
        this.unitOfMeasurement = "";
    }

    public Product(String nameP, int priceP, String measurementUnit) {
        this.name = nameP;
        this.price = priceP;
        this.unitOfMeasurement = measurementUnit;
    }

    public String toString() {
        return Format.complete(name, 15) + Format.complete("$" + price);
    }

    public int getPrice() {
        return price;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }
}
