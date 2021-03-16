package org.fundacionjala.prog101.Examen;

import java.util.ArrayList;

public class Promotion {
    ArrayList<Product> listProd;
    ArrayList<Integer> cant;

    public Promotion(){
        listProd = new ArrayList<>();
        cant = new ArrayList<>();
        listProd.add(new Product("Bread", 1));
        listProd.add(new Product("Milk", 10));
        listProd.add(new Product("Oil", 10));
        listProd.add(new Product("Rice", 5));
        cant.add(10);
        cant.add(5);
        cant.add(10);
        cant.add(20);
    }

    Promotion(ArrayList<Product> listProducts, ArrayList<Integer> listCant){
        this.listProd = listProducts;
        this.cant = listCant;
    }

    public void add(Product product, int cantProd){
        listProd.add(product);
        cant.add(cantProd);
    }

    public boolean productInPromotion(Product product, int cantProd){
        for (int i = 0; i < listProd.size(); i++) {
            if ((listProd.get(i).getName() == product.getName()) && (cant.get(i) == cantProd)){
                return true;
            }
        }
        return false;
    }
}
