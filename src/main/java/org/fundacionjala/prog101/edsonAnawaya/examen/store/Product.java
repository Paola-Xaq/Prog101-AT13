package org.fundacionjala.prog101.edsonAnawaya.examen.store;

public class Product {
    private String name;
    private int price;
    private int cant = 1;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String newDetail) {
        this.detail = newDetail;
    }


    public int getCant() {
        return cant;
    }

    public void setCant(final int newCant) {
        this.cant = newCant;
    }


    public String getName() {
        return name;
    }

    public void setName(final String newName) {
        this.name = newName;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(final int newPrice) {
        this.price = newPrice;
    }


    public Product(final String newName, final int newPrice) {
        this.name = newName;
        this.price = newPrice;
    }
}
