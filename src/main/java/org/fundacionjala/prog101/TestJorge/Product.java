package org.fundacionjala.prog101.TestJorge;

public abstract class Product {
    int discount = 10;
    int cantPromo;
    String name;
    String type;
    int price;
    int amount;
    Product(String name, int price, int amount,String type,int cantPromo){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.cantPromo = cantPromo;
    }
    int getPrice(){
        return price;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void updateAmount(int newAmount){
        amount = amount + newAmount;
    }
    public int getAmount() {
        return amount;
    }
    public double getTotalCost(){
            return getPromoCost();
    }
    public double getPromoCost(){
        if(amount<cantPromo){
            return amount * price;
        }else {
            return amount * price-amount/discount*price;
        }
    }
    public int getCantPromo() {
        return cantPromo;
    }
    public int getRegularPrice(){
        return cantPromo*price;
    }
    public double promoPrice(){
        return getRegularPrice() -cantPromo/discount*price;
    }

    public int getDiscount() {
        return discount;
    }
}
