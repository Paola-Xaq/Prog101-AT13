package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

import java.util.List;

public class BreadProm extends PromotionRules {

    public BreadProm() {
        super("Bread", 10, 9);
    }

    public int newPromPrice(Product products) {
        return super.newPromPrice(products);
    }
}
