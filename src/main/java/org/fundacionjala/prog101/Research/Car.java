package org.fundacionjala.prog101.Research;

public class Car {
    private String brand;
    /**
     * class Car with atribute brand.
     */
    public Car (final String brand) {
        this.brand = brand;
    }

    /**
     * Method to return the brand of ths car.
     * @return String brand.
     */
    public String getBrand() {
        return this.brand;
    }
}
