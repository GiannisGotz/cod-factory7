package gr.aueb.cf.myexperiments;

import java.util.Scanner;

public class SimpleBank {

    public static void main(String[] args) {

        try {
            printmenu();
            int choice = getChoice();
            System.out.println("Your choice is: " + choice);
        } catch (IllegalArgumentException e) {
            System.out.println(" Error " + e.getMessage());
        }


    }

    public static void printmenu() {
        System.out.println("--- Simple Bank Menu ---");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Print receipt");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("Number must be valid between 1 and 5");
            } else {
                return choice;
            }
        }
        return choice;
    }
}



