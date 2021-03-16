package org.fundacionjala.prog101.cristianchoque.examen;

public class Product {

    private String name;
    private String type;
    private String brand;
    private String price;
    private String unit;
    private int promo;
    private int discount;

    public Product(
            final String newName,
            final String newUnit,
            final String newType,
            final String newBrand,
            final String newPrice,
            final int newPromo,
            final int newDiscount) {
        this.name = newName;
        this.type = newType;
        this.brand = newBrand;
        this.price = newPrice;
        this.unit = newUnit;
        this.promo = newPromo;
        this.discount = newDiscount;
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

    /**
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     * @return
     */
    public int getPromo() {
        return promo;
    }

    /**
     *
     * @return
     */
    public int getDiscount() {
        return discount;
    }

    /**
     *
     * @param newName
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     *
     * @param newType
     */
    public void setType(final String newType) {
        this.type = newType;
    }

    /**
     *
     * @param newBrand
     */
    public void setBrand(final String newBrand) {
        this.brand = newBrand;
    }

    /**
     *
     * @param newPrice
     */
    public void setPrice(final String newPrice) {
        this.price = newPrice;
    }

    /**
     *
     * @param newUnit
     */
    public void setUnit(final String newUnit) {
        this.unit = newUnit;
    }

    /**
     *
     * @param newPromo
     */
    public void setPromo(final int newPromo) {
        this.promo = newPromo;
    }

    /**
     *
     * @param newDiscount
     */
    public void setDiscount(final int newDiscount) {
        this.discount = newDiscount;
    }
}
