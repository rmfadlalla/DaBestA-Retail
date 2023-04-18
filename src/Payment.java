
public class Payment {

    private double totalAmount;
    private double discountAmount;
    private int loyaltyPointsUsed;

    /**
     * @param totalAmount
     * @param discountAmount
     * @param loyaltyPointsUsed
     */
    public Payment(double totalAmount, double discountAmount, int loyaltyPointsUsed) {
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.loyaltyPointsUsed = loyaltyPointsUsed;
    }

    /**
     * @return totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return discountAmount
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * @param discountAmount
     */
    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * @return loyaltyPointsUsed
     */
    public int getLoyaltyPointsUsed() {
        return loyaltyPointsUsed;
    }

    /**
     * calculate loyalty points used
     * @param loyaltyPointsUsed
     */
    public void setLoyaltyPointsUsed(int loyaltyPointsUsed) {
        this.loyaltyPointsUsed = loyaltyPointsUsed;
    }
}
