package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

public class Category {
    String type;
    String unit;

    public Category(String type) {
        this.type = type;
    }

    /**
     * Get unit of Product according to Category
     * @return name
     */
    public String getUnit() {
        if (type == "Grain")
            unit = "kg";
        else if (type == "Lactose" || type == "Liquid")
            unit = "lt";
        else
            unit = "u";
        return unit;
    }
}
