public class Product {
    private String name;
    private String unitOfMeasurement;
    private double promotionPrice;
    private int quantityForPromotion;
    private int price;
    Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    Product (String name, int price, String unitOfMeasurement) {
        this.name = name;
        this.price = price;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    Product (String name, int price, String unitOfMeasurement, int promotionPrice, int quantityForPromotion) {
        this.name = name;
        this.price = price;
        this.unitOfMeasurement = unitOfMeasurement;
        this.promotionPrice = ((double) promotionPrice / quantityForPromotion);
        this.quantityForPromotion = quantityForPromotion;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public String getPromotionPercentage() {
        double percentage = ((price - getPromotionPrice()) * 100) / price;
        return "" + String.format("%.1f", percentage) + "%";
    }

    public int getQuantityForPromotion() {
        return quantityForPromotion;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }
}
