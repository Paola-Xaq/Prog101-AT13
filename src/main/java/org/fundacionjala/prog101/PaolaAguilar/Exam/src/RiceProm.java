package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class RiceProm extends PromotionRules{

    public RiceProm() {
        super("Rice", 20, 90);
    }

    public int newPromPrice(Product products) {
        return super.newPromPrice(products);
    }
}
