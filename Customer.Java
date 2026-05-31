// Customer.java
// Represesnts a bank customer with a unique ID, name, and email.
// Provides methods to open an account and retrieve customer info.

public class Customer {

    // Private attributes
    private int customerID;
    private String name;
    private String email;

    // Constructor to init a Customer object
    public Customer(int customerID, String name, String email) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
    }

    // Simulates opening a new account for the customer
    public void openAccount() {
        System.out.println(name + " has opened a new account!");
    }

    // Returns formatted string of customer info
    public String getCustomerInfo() {
        return "ID: " + customerID + " | Name: " + name + " | Email: " + email;
    }
}