import java.util.*;

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Transfer
    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred " + amount + " to " + receiver.holderName);
        } else {
            System.out.println("Transfer failed!");
        }
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber + ", Name: " + holderName + ", Balance: " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new BankAccount(101, "Alice", 5000);
        BankAccount a2 = new BankAccount(102, "Bob", 3000);

        accounts.add(a1);
        accounts.add(a2);

        a1.deposit(1000);
        a2.withdraw(500);
        a1.transfer(a2, 2000);

        for (BankAccount acc : accounts) {
            acc.displayAccount();
        }
    }
}
