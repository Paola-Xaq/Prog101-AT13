package org.fundacionjala.prog101.joelrojas.supermarket;

import java.util.ArrayList;

public class Promo {
    private ArrayList<Product> products;
    private ArrayList<Integer> amounts;
    public Promo() {
        products = new ArrayList<>();
        products.add(new Product("Bread", 9));
        products.add(new Product("Milk", 45));
        products.add(new Product("Oil", 90));
        products.add(new Product("Rice", 90));
        amounts = new ArrayList<>();
        amounts.add(10);
        amounts.add(5);
        amounts.add(10);
        amounts.add(20);
    }

    public Promo(ArrayList<Product> promoProductList, ArrayList<Integer> promoAmountList) {
        products = promoProductList;
        amounts = promoAmountList;
    }

    public void add(Product product, int amount) {
        products.add(product);
        amounts.add(amount);
    }

    public boolean hasProm(Product product, int amount) {
        boolean res = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == product.getName()
             && amounts.get(i) >= amount) {
                res = true;
            }
        }
        return res;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Integer> getAmounts() {
        return amounts;
    }
}
