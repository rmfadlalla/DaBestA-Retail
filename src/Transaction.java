import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Transaction {
    Customer customer;
    LoyaltyCard loyaltyCard;
    Set<Item> items;

    //Item, Quantity
    ShoppingCart cart;


    /**
     * Create a new Transaction
     * @param customer the customer making the transaction
     * @param loyaltyCard the customers loyalty card
     * @param items a set of all items available to purchase
     * @param offers a set of all offers currently available
     */
    public Transaction(Customer customer, LoyaltyCard loyaltyCard, Set<Item> items{
        this.customer = customer;
        this.loyaltyCard = loyaltyCard;
        this.items = items;
        cart = new ShoppingCart();
        startShopping();
    }

    /**
     *
     */
    //User Interaction
    public void startShopping(){
        System.out.print("Welcome, " + customer.getName() + "! What would you like to do?%n");
        if (getCartMap().isEmpty()){
            System.out.printf("1: Add items to cart %n");
            System.out.printf("2: View Catalog n%");
            System.out.printf("3: Log Out %n");
        }

        else{
            System.out.printf("1: Add items to cart %n");
            System.out.printf("2: View Catalog n%");
            View

        }

    }

    //Basic Setters And Getters

    /**
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }


    /**
     * @return loyaltyCard
     */
    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }


    /**
     * @return items all items available for purchase
     */
    public Set<Item> getItems() {
        return items;
    }

    /**
     * @param items
     */
    public void setItems(Set<Item> items) {
        this.items = items;
    }

    /**
     * Get a map of the the items the customer wants to purchase and the quantity of each item
     * @return cart.getCart The cart as a map
     */
    public Map<Item, Integer> getCartMap() {
        return cart.getCart();
    }

    //Interactions with cart

    /**
     * Add an item to the shoppingCart.
     * If the item is already in the cart, adds more of the item
     * @param item the item to be added to the cart
     * @param quantity the quantity of the item to be added
     * @return true if added successfully, else returns false
     */
    public boolean addToCart(Item item, int quantity) {
        if (!items.contains(item))
            return false;
        else {
            cart.addToCart(item, quantity);
            return true;
        }
    }

    /**
     * Remove an item from the shopping cart
     * @param item the item to be removed
     * @return true if removed successfully, else returns false
     */
    public boolean removeFromCart(Item item){
        if (!cart.isInCart(item)){
            return false;
        }
        else {
            cart.removeFromCart(item);
            return true;
        }
    }

    /**
     * Removes a given quantity of an item from the shopping cart
     * @param item the item to remove
     * @param quantity the quantity of the item to remove
     * @return true if removed successfully, else returns false
     */
    public boolean removeFromCart(Item item, int quantity){
        if (!cart.isInCart(item)){
            return false;
        }
        else {
            cart.removeFromCart(item, quantity);
            return true;
        }
    }

    //checkout

    /**
     * call Payment to checkout
     */
    public void checkout(Customer customer, LoyaltyCard loyaltyCard, ShoppingCart cart){
//        Payment.
    }

}
