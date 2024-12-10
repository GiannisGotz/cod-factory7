package gr.aueb.cf.myexperiments;

import java.util.Scanner;

/**
 * Java Arithmetic Exception
 *
 */
public class ArithmeticExceptionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator ( 0 for quit) and a denominator:");
                numerator = in.nextInt();
                if (numerator == 0) {
                    break;
                }
                denominator = in.nextInt();
                result = numerator / denominator;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator should not be zero");
            }
        }
        System.out.println("Thanks for using the app");
    }
}
