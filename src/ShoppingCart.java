import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

/**
 * A class holding a Map of Items a Customer wants to purchase
 */
public class ShoppingCart{
    Map<Item, Integer> cart;

    /**
     * Create a new shopping cart
     */
    public ShoppingCart(){
        cart = new TreeMap<>();
    }

    /**
     * Add an item to the shoppingCart.
     * If the item is already in the cart, adds more of the item
     * @param item the item to be added to the cart
     * @param quantity the quantity of the item to be added
     */
    public void addToCart(Item item, int quantity){
        if (isInCart(item)){
            cart.put(item, quantity + cart.get(item));
        }
        else {
            cart.put(item, quantity);
        }
    }

    /**
     * Remove an item from the shopping cart
     * @param item the item to be removed
     */
    public void removeFromCart(Item item){
        cart.remove(item);
    }


    /**
     * Removes a given quantity of an item from the shopping cart
     * @param item the item to remove
     * @param quantity the quantity of the item to remove
     */
    public void removeFromCart(Item item, int quantity) {
        if (cart.get(item) < quantity){
            cart.put(item, cart.get(item) - quantity);
        }
        else {
            cart.remove(item);
        }
    }

    /**
     * Check if a given item is in the cart
     * @param item the item to be checked
     * @return true if present, else false
     */
    public boolean isInCart(Item item) {
        if (cart.containsKey(item)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Get a Map of every Item in the cart and the Quantity of each
     * @return cart
     */
    public Map<Item, Integer> getCart() {
        return cart;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj == null || !(obj instanceof ShoppingCart)){
//            return false;
//        }
//        ShoppingCart otherCart = (ShoppingCart) obj;
//        return Objects.equals(cart, otherCart.getCart());
//
//    }
}
