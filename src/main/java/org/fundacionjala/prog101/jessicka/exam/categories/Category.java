package org.fundacionjala.prog101.jessicka.exam.categories;

public abstract class Category {
    String type;
    String unity;

    public Category(String type, String unity) {
        this.type = type;
        this.unity = unity;
    }

    public String getUnity() {
        return this.unity;
    }
}
