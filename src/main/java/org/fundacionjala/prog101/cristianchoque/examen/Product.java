package org.fundacionjala.prog101.cristianchoque.examen;

public class Product {

    private String name;
    private String type;
    private String brand;
    private String price;

    public Product(final String newName, final String newType, final String newBrand, final String newPrice) {
        this.name = newName;
        this.type = newType;
        this.brand = newBrand;
        this.price = newPrice;
    }

    /**
     *
     * @return
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }
}
