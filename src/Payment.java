
public class Payment {

    private double totalAmount;
    private double discountAmount;
    private int loyaltyPointsUsed;

    public Payment(double totalAmount, double discountAmount, int loyaltyPointsUsed) {
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.loyaltyPointsUsed = loyaltyPointsUsed;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getLoyaltyPointsUsed() {
        return loyaltyPointsUsed;
    }

    public void setLoyaltyPointsUsed(int loyaltyPointsUsed) {
        this.loyaltyPointsUsed = loyaltyPointsUsed;
    }
}
