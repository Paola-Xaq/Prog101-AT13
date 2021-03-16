package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class OilProm extends PromotionRules{

    public OilProm() {
        super("Oil", 10, 90);
    }

    public int newPromPrice(Product products) {
        return super.newPromPrice(products);
    }
}
