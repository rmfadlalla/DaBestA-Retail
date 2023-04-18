
public class Offer {

    private String name;
    private String description;
    private int quantityNeeded;
    private double discountPercentage;

    /**
     * @param name
     * @param description
     * @param quantityNeeded
     * @param discountPercentage
     */
    public Offer(String name, String description, int quantityNeeded, double discountPercentage) {
        this.name = name;
        this.description = description;
        this.quantityNeeded = quantityNeeded;
        this.discountPercentage = discountPercentage;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
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
     * @return
     */
    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    /**
     * @param quantityNeeded
     */
    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    /**
     * @return
     */
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * @param discountPercentage
     */
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
