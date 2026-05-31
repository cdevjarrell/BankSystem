// Main.java
// Entry point of the bank program. Creates instances of Customer, Account, and Transaction to demonstrate
// the relationships between classes.

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Create customer
        Customer customer = new Customer(1, "John Smith", "john@email.com");
        System.out.println(customer.getCustomerInfo());

        // Customer opens an account
        customer.openAccount();

        // Create an account and make a deposite
        Account account = new Account (101, 500.00, "Checking");
        account.deposit(250.00);
        System.out.println("Current balance: $" + account.getBalance());

        // Create a transaction to display details
        Transaction transaction = new Transaction (1001, 250.00, LocalDate.now().toString());
        transaction.getTransactionDetails();

        //Test for withdrawal
        account.withdraw(100.00);
    }
}