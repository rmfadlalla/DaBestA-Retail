
public class LoyaltyCard {

    private Customer customer;
    private int points;

    public LoyaltyCard(Customer customer, int points) {
        this.customer = customer;
        this.points = points;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
    }

    public boolean redeemPoints(int pointsToRedeem) {
        if (points >= pointsToRedeem) {
            points -= pointsToRedeem;
            return true;
        }
        return false;
    }
}
