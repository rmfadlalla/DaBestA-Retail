
public class Item {

    private String itemName;
    private String description;
    private double price;

    /**
     * @param itemName
     * @param description
     * @param price
     */
    public Item(String itemName, String description, double price) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }

    /**
     * @return itemName
     */
    public String getName() {
        return itemName;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.itemName = name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
