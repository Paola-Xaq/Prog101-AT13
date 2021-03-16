package org.fundacionjala.prog101.cristianchoque.examen;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Product> productList;
    private double totalCost = 0.0;
    private ArrayList cant = new ArrayList();
    private ArrayList total = new ArrayList();
    private ArrayList discount = new ArrayList();

    public Invoice() {
        productList = new ArrayList<>();
    }

    /**
     *
     */
    public void showInvoice() {
        int canti;
        String unit;
        String name;
        String price;
        int tPrice;
        double withDiscount;
        for (int i = 0; i < productList.size(); i++) {
            canti = Integer.parseInt(cant.get(i).toString());
            name = productList.get(i).getName();
            unit = productList.get(i).getUnit();
            price = productList.get(i).getPrice();
            withDiscount = Double.parseDouble(discount.get(i).toString());
            tPrice = Integer.parseInt(total.get(i).toString());
            System.out.println(canti + " " + unit + "\t\t\t" + name + "\t\t" + "$" + price + "\t\t" + "$" + tPrice + " " + "\t" + "$" + withDiscount);
        }
    }

    /**
     *
     * @param product
     */
    public void addProduct(final int quantities, final Product product) {
        productList.add(product);
        cant.add(quantities);
        total.add(quantities * Integer.parseInt(product.getPrice()));
        int promo = product.getPromo();
        int discountProduct = product.getDiscount();
        double totalDiscountProduct;
        double var2 = quantities / promo;
        double rest = quantities % promo;
        double totalOnlyProduct;
        if (var2 > 0) {
            totalDiscountProduct = ((promo * var2 * (100 - discountProduct)) / 100) * Double.parseDouble(product.getPrice());
            totalOnlyProduct = rest * Double.parseDouble(product.getPrice());
            discount.add(totalDiscountProduct + totalOnlyProduct);
        } else {
            discount.add(quantities * Double.parseDouble(product.getPrice()));
        }
    }

    /**
     *
     * @return
     */
    public double getTotalCost() {
        for (int i = 0; i < productList.size(); i++) {
            totalCost = totalCost + Double.valueOf(discount.get(i).toString());
        }
        return totalCost;
    }

}
