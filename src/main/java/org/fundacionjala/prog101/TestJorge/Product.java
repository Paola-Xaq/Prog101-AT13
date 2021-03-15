package org.fundacionjala.prog101.TestJorge;

public class Product {
    String name;
    int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    int getPrice(){
        return price;
    }
    public String getName() {
        return name;
    }
}
