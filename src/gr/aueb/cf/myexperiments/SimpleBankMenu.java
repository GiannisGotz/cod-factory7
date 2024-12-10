package gr.aueb.cf.myexperiments;

import java.util.Scanner;

public class SimpleBankMenu {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            try {
                int choice = getChoice();
                handleChoice(choice);
            } catch (IllegalArgumentException e) {
                System.err.println("Error in main: " + e.getMessage());
            }
        }
    }

    public static void handleChoice(int choice)  throws IllegalArgumentException {
        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                try {
                    deposit(depositAmount);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error in deposit: " + e.getMessage());
                    throw e;
                }
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                try {
                    withdraw(withdrawAmount);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error in withdraw: " + e.getMessage());
                    throw e;
                }
                break;
            case 3:
                System.out.println("Current balance: $" + balance);
                break;
            case 4:
                System.out.println("Printing receipt... (This is a placeholder)");
                System.out.println("Thank you for using Simple Bank. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

        public static void printMenu () {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
        }

        public static int getChoice () {
            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException("Number must be valid between 1 and 4.");
                }
            } else {
                scanner.next();
            }
            return choice;
        }

        public static void withdraw ( double amount){
            if (amount < 0 || amount > balance) {
                throw new IllegalArgumentException("Amount must be positive and less than or equal to the current balance.");
            }
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        }


        public static void deposit ( double amount){
            if (amount < 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        }
    }

