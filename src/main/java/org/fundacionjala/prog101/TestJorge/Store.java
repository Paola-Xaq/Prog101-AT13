package org.fundacionjala.prog101.TestJorge;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> productsList;
    Store(){
        productsList = new ArrayList<>();
    }
    int getProductsCost(){
        int totalCost = 0;
        for (Product product:productsList) {
            totalCost = totalCost + product.getPrice();
        }
        return totalCost;
    }
    void buy(Product product){
        if(productsList.contains(product)){
            int index= productsList.indexOf(product);
            productsList.get(index).updateAmount(product.getAmount());
        }else {
            productsList.add(product);
        }
    }
     String createInvoice(Product product){
         return  product.getAmount()+""+product.getType()+" "+product.getName()+" $"+product.getPrice()+" $"+product.getTotalCost();
    }
    void printInvoice(){
        for (Product product:productsList) {
            System.out.println(createInvoice(product));
        }
    }
    String showPromo(Product product){
        return "Per "+product.getCantPromo()+" "+product.getType()+" of "+product.getName()+", pay $"+product.promoPrice()+"(Regular cost "+ product.getRegularPrice()+")" ;
    }
    void printPromo(){
        for (Product product:productsList) {
            System.out.println(showPromo(product)+" % of discount: "+product.getDiscount());
        }
    }
}
