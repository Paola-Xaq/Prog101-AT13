package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Product> productsSold;
    Invoice( ArrayList<Product> productsSold){
        this.productsSold=productsSold;
    }
    int getTotalCost(){
        int sum=0;
        for (Product product1 : productsSold) {
            sum=sum+product1.getprice();
        }
        return sum;
    }
}
