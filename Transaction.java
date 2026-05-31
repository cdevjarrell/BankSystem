// Transaction.java
// Represents a bank transaction with an ID, amount, and date.
// Provides a methdo to retrieve transaction details.

public class Transaction {

    // Private attributes for Transcation class
    private int transactionID;
    private double amount;
    private String date;

    //Constructor to init a Transaction object
    public Transaction(int transactionID, double amount, String date) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.date = date;
    }

    // Returns a formatted string of transaction details
    public void getTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID + " | Amount: $" + amount + " | Date: " + date);
    }
}