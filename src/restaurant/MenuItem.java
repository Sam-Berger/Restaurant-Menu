package restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean newOrOld;

    public MenuItem(String name, double price, String description, String category, boolean newOrOld) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newOrOld = newOrOld;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public boolean isNewOrOld() {
        return newOrOld;
    }

    public void setNewOrOld(boolean aNewOrOld) {
        newOrOld = aNewOrOld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
