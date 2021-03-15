public class Product {
    private String name;
    private String unitOfMeasurement;
    private String category;
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
