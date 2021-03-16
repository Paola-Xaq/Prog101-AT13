package org.fundacionjala.prog101.joelrojas.supermarket;

public class Product {
    private String name;
    private int price;
    private String category;
    private String unitOfMeasurement;
    private boolean inPromo;

    public Product(String nameP, int priceP) {
        this(nameP, priceP, "");
    }

    public Product(String nameP, int priceP, String measurementUnit) {
        this.name = nameP;
        this.price = priceP;
        this.unitOfMeasurement = measurementUnit;
        this.inPromo = false;
    }

    public String toString() {
        return Format.complete(name, Format.NAME) + Format.complete("$" + price);
    }

    public int getPrice() {
        return price;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public String getName() {
        return name;
    }

    public boolean getinPromo() {
        return inPromo;
    }

    public void putInPromo() {
        inPromo = true;
    }
}
