
public class Offer {

    private String name;
    private String description;
    private int quantityNeeded;
    private double discountPercentage;

    public Offer(String name, String description, int quantityNeeded, double discountPercentage) {
        this.name = name;
        this.description = description;
        this.quantityNeeded = quantityNeeded;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
