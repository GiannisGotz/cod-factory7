package gr.aueb.cf.ch13mine.bankapp;

import gr.aueb.cf.ch13mine.bankapp.model.*;

public class Main {

    public static void main(String[] args) {
        // Testing OverdraftAccount
        OverdraftAccount overdraftAccount = new OverdraftAccount(150, 300);
        System.out.println("Initial Balance: " + overdraftAccount.getBalance());
        overdraftAccount.deposit(100);
        System.out.println("Balance after deposit: " + overdraftAccount.getBalance());
        System.out.println("Withdraw 549: " + (overdraftAccount.withdraw(549) ? "Success" : "Failure"));
        System.out.println("Balance after withdrawal: " + overdraftAccount.getBalance());
        System.out.println("Withdraw 10: " + (overdraftAccount.withdraw(10) ? "Success" : "Failure"));
        System.out.println("Balance after withdrawal: " + overdraftAccount.getBalance());
        System.out.println();


        // Testing JoinAccount
        JoinAccount jointAccount = new JoinAccount(500, "Giannis", "Christina");
        System.out.println("Balance : " +jointAccount.getBalance());
        jointAccount.deposit(500);
        System.out.println("Balance after 500 deposit : " +jointAccount.getBalance());
        jointAccount.withdraw(700);
        System.out.println("Balance after 700 withdraw: " +jointAccount.getBalance());
        System.out.println("Holders of Joint Account: " +String.join(" & ", jointAccount.getHolders()));



    }
}
