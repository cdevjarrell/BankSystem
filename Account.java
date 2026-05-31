// Account.java
// Represents a bank account with a balance and account type.
// Provides methods to deposit and withdraw money, and retrieve the balance.

public class Account {

    // Private account attributes
    private int accountID;
    private double balance;
    private String accountType;

    // Constructor to init an Account object
    public Account(int accountID, double balance, String accountType) {
        this.accountID = accountID;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Adds the given amount to the account balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " | New Balance is: $" + balance);
    }

    // Subtracts the givena mount from the balance if sufficient funds are available

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.pritnln("Withdrew $" + amount + " | New balance: $" + balance);
        }
    }

    // Returns the current account balance
    public double getBalance() {
        return balance;
    }
}