public class Product {
    private String name;
    private String type;
    private String brand;
    private int price;
    Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
