package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class MilkProm extends PromotionRules{

    public MilkProm() {
        super("Milk", 5, 45);
    }

    public int newPromPrice(Product products) {
        return super.newPromPrice(products);
    }
}
