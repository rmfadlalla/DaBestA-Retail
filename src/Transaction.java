import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Transaction {
    Customer customer;
    LoyaltyCard loyaltyCard;
    ArrayList<Item> catalog;
    ShoppingCart cart;


    /**
     * Create a new Transaction
     * @param customer the customer making the transaction
     * @param loyaltyCard the customers loyalty card
     * @param items a set of all items available to purchase
     */
    public Transaction(Customer customer, LoyaltyCard loyaltyCard, Set<Item> items){
        for (Item item: items) {
            this.catalog.add(item);
        }
        this.customer = customer;
        this.loyaltyCard = loyaltyCard;

        cart = new ShoppingCart();
        startShopping();
    }

    /**
     * Customer Interaction Menu
     */
    public void startShopping(){
        boolean loggedIn = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome, " + customer.getName() + "! What would you like to do?%n");

        while (loggedIn) {
            int menuChoice = 0;

            if (cart.getCart().isEmpty()){
                System.out.printf("1: Add items to cart %n");
                System.out.printf("2: View Catalog n%");
                System.out.printf("3: Quit %n");
                if (in.hasNextInt()) {
                    menuChoice = in.nextInt();
                }
                switch (menuChoice) {
                    case 1: //Add to Cart
                        addToCart();
                        break;
                    case 2: //View Catalog
                        printCatalog();
                    case 3: //Quit
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid Choice, please try again");
                }
            }
            else {
                System.out.printf("1: Add items to cart %n");
                System.out.printf("2: View Catalog n%");
                System.out.printf("3: View Cart %n");
                System.out.printf("4: Remove item from cart %n");
                System.out.printf("5: Proceed to Checkout %n");
                System.out.printf("6: Quit %n");
                if (in.hasNextInt()) {
                    menuChoice = in.nextInt();
                }
                switch (menuChoice) {
                    case 1: //Add to Cart
                        addToCart();
                        break;
                    case 2: //View Catalog
                        printCatalog();
                    case 3: //view cart
                        viewCart();
                        break;
                    case 4: //remove item
                        removeFromCart();
                        break;
                    case 5: //Checkout (incomplete)
                        checkout();
                        break;
                    case 6: //Quit
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid Choice, please try again");
                }
            }
        }
    }

    //Basic Getters

    /**
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }
    //done

    /**
     * @return loyaltyCard
     */
    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
    //done

    /**
     * Print the catalog
     */
    //done
    public void printCatalog() {
        int i = 0;
        for (Item item: catalog) {
            System.out.printf("%3d:   %30s    %7.2f", i, item.getName(), item.getPrice());
            i++;
        }
    }

    //Interactions with cart

    /**
     * Add items to the shoppingCart.
     * If the item is already in the cart, adds more of the item
     */
    public void addToCart() {
        System.out.println("Add items to your cart");
        Scanner in = new Scanner(System.in);
        boolean addMore = true;
        while (addMore) {
            int choice =  -2;
            System.out.println("Enter the catalog number of the item to add, or enter \"-1\" to quit:");
            if (in.hasNextInt()) {
                choice = in.nextInt();
            }
            if (choice == -1) {
                addMore = false;
            }
            else if (choice < -1 || choice >= catalog.size()) {
                System.out.println("Invalid choice, please try again");
            }
            else {
                Item item = catalog.get(choice);
                int quantity = 0;
                do{
                    System.out.println("how many would you like?");
                    if (in.hasNextInt()) {
                        quantity = in.nextInt();
                        cart.addToCart(item, quantity);
                    }
                    else {
                        System.out.println("Invalid Number, please try again");
                    }
                }
                while (quantity == 0);
            }
        }
    }
    //done

    /**
     * Removes a given quantity of an item from the shopping cart
     */
    public boolean removeFromCart(){
        Scanner in = new Scanner(System.in);
        viewCart();
        int choice = -1;
        System.out.print("Enter the number of the item you want to remove: ");
        do {
            if (in.hasNextInt()){
                choice = in.nextInt();
            }
            if (choice < 0 || choice >= cart.getCart().size()){
                System.out.println("Invalid option, please try again.");
            }

            else {
                cart.getCart().get(cart.getCart().keySet());
                cart.removeFromCart(item, quantity);
            }
        }
        while ();

    }

    /**
     * View Contents of cart
     */
    public void viewCart() {
        System.out.printf("Your Cart%n#    Item Name                     Quantity%n");
        int i = 0;
        for(Item key: cart.getCart().keySet()) {
            System.out.printf("%3d: %30s     %3d", i, key.getName(), cart.getCart().get(key));
        }
    }
    //done



    //checkout

    /**
     * call Payment to start checkout
     */
    public void checkout(Customer customer, LoyaltyCard loyaltyCard, ShoppingCart cart){
//        Pa
    }

}
