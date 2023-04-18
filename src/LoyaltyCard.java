
public class LoyaltyCard {

    private Customer customer;
    private int points;

    /**
     * @param customer
     * @param points
     */
    public LoyaltyCard(Customer customer, int points) {
        this.customer = customer;
        this.points = points;
    }

    /**
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * @param pointsToAdd
     */
    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
    }

    /**
     * @param pointsToRedeem
     * @return
     */
    public boolean redeemPoints(int pointsToRedeem) {
        if (points >= pointsToRedeem) {
            points -= pointsToRedeem;
            return true;
        }
        return false;
    }
}
