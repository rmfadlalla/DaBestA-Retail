
public class Customer {
    
    private String name;
    private String address;
    private String phoneNumber;

    /**
     * create a new Customer object
     * @param name
     * @param address
     * @param phoneNumber
     */
    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get customer's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Update customer's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get customer's address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Update customer's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get customer's phone number
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Update customer's phone Number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
