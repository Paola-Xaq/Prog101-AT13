package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

public abstract class PromotionRules {
    private String typeProm;
    private int amountNeeded;
    private int newPrice;

    public PromotionRules(String typeProm, int amount, int newPrice) {
        this.typeProm = typeProm;
        this.amountNeeded = amount;
        this.newPrice = newPrice;
    }

    public int newPromPrice(Product product) {
        if(product.getProductName().equals(typeProm) && product.getAmount() == amountNeeded){
                return newPrice;
        }
        return 0;
    }
}
