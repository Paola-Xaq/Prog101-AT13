package org.fundacionjala.prog101.TestJorge;

import org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion1.Figure;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> productsList;
    Store(){
        productsList = new ArrayList<>();
    }
    void buy(Product product){
        productsList.add(product);

    }
     List<Product> createInvoice(){
         return  productsList;
    }
    int getTotalCost(){
        int totalCots = 0;
        for (Product product:productsList) {
            totalCots += product.getPrice();
        }
        return totalCots;
    }
    void printInvoice(){
        for (Product product:productsList) {
            System.out.println(productsCounter("Pilfrut") +" "+product.getName()+" "+ product.getPrice());
        }
        System.out.println("Costo total :"+getTotalCost()+ "Bs");
    }
    int productsCounter(String productName){
        int counter=0;
        for (Product product:productsList) {
            productsList.contains(productName);
            counter++;
        }
        return counter;
    }
}
