package org.fundacionjala.prog101.edsonAnawaya.examen.store;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> productsObjects;
    private float promos = 0;

    public void setPromos(int newPromos) {
        this.promos = newPromos;
    }

    public Invoice() {
        productsObjects = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product = addDetail(product);
        if (!verifyExist(product)) {
            productsObjects.add(product);
        }
    }

    public Product addDetail(Product product) {
        if (product.getName() == "Milk" || product.getName() == "Oil") {
            product.setDetail("lt");
            return product;
        }
        if (product.getName() == "Bread") {
            product.setDetail("u");
            return product;

        }
        if (product.getName() == "Rice") {
            product.setDetail("kg");
            return product;
        }

        return product;
    }

    private boolean verifyExist(Product newProduct) {

        for (Product product : productsObjects) {
            if (product.getName() == newProduct.getName()) {
                product.setCant(product.getCant() + 1);
                return true;
            }
        }
        return false;
    }

    public int getTotalCost() {
        int sumTotal = 0;
        int sumPartial = 0;
        float discount = 0;
        final int numberDiscount = 100;
        printHead();
        for (Product product : productsObjects) {
            sumPartial = product.getPrice() * product.getCant();
            discount = sumPartial * (this.promos / numberDiscount);
            sumPartial = sumPartial - (int) discount;
            sumTotal += sumPartial;
            printBody(product.getCant(), product.getDetail(), product.getName(), product.getPrice(), sumPartial);
        }
        printFooter(sumTotal);
        return sumTotal;
    }

    public void printHead() {
        System.out.println("Cant    Product    Price   Total    Discount");
        System.out.println("--------------------------------------------");
    }

    public void printBody(final int cant, final String detail, final String name, final int price, final int sumPartial) {
        System.out.println(cant + " " + detail + "    " + name + "   -     $" + price + "      $" + sumPartial + "     %" + (int) this.promos);
    }

    public void printFooter(final int sumTotal) {
        System.out.println("--------------------------------------------");
        System.out.println("Total                        $" + sumTotal);
    }
}
