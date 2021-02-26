package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;

    public MenuItem(String name, double price, String description, String category) {
        name = this.name;
        price = this.price;
        description = this.description;
        category = this.category;
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
}
