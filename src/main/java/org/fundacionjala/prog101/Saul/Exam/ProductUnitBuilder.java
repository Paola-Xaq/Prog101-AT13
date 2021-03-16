package org.fundacionjala.prog101.Saul.Exam;

public class ProductUnitBuilder {
    public ProductUnitBuilder() {

    }
    public ProductUnit getProductUnit(String name) {
        ProductUnit productUnit = null;
        switch (name) {
            case "Liters" : productUnit = new Liters();
                break;
            case "Unit" : productUnit = new Unit();
                break;
            case "Kilogram" : productUnit = new Kilogram();
                break;
        }
        return productUnit;
    }
}
