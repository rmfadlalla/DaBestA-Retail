import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Transaction implements Comparable<Transaction>{
    Customer customer;
    LoyaltyCard loyaltyCard;
    Set<Item> items;
    Set<Offer> offers;
    //Item, Quantity
    ShoppingCart cart;


    /**
     * @param customer the customer making the transaction
     * @param loyaltyCard the customers loyalty card
     * @param items a set of all items available to purchase
     * @param offers a set of all offers currently available
     */
    public Transaction(Customer customer, LoyaltyCard loyaltyCard, Set<Item> items, Set<Offer> offers){
        this.customer = customer;
        this.loyaltyCard = loyaltyCard;
        this.items = items;
        this.offers = offers;
        cart = new ShoppingCart();
    }

    /**
     * @return customer
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
     * @return loyaltyCard
     */
    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    /**
     * @param loyaltyCard
     */
    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
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
     * @return offers
     */
    public Set<Offer> getOffers() {
        return offers;
    }

    /**
     * @param offers
     */
    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    /**
     * @return shoppingCart A map the items the customer wants to purchase. Item is the item and Integer is the quantity of that item
     */
    public ShoppingCart getShoppingCart() {
        return cart;
    }

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
        if (shoppingCart.containsKey(item)){
            shoppingCart.put(item, quantity + shoppingCart.get(item));
            return true;
        }
        else {
            shoppingCart.put(item, quantity);
            return true;
        }
    }

    /**
     * Remove an item from the shopping cart
     * @param item the item to be removed
     * @return true if removed successfully, else returns false
     */
    public boolean removeFromCart(Item item){
        if (!shoppingCart.containsKey(item)){
            return false;
        }
        else {
            shoppingCart.remove(item);
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
        if (!shoppingCart.containsKey(item)){
            return false;
        }
        else {
            if (shoppingCart.get(item) < quantity){
                shoppingCart.put(item, shoppingCart.get(item) - quantity);
            }
            else {
                shoppingCart.remove(item);
            }
            return true;
        }
    }

    /**
     * call Payment to checkout
     */
    public void checkout(){
        Payment.
    }

    @Override
    public int compareTo(Transaction o) {
        if(shoppingCart.equals(o.shoppingCart)){
            return 0;
        }
    }
}
