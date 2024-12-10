package gr.aueb.cf.myexperiments;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Input mismatch exception when user inserts
 * a non-numeric string instead of integer.
 */

public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        try {
            System.out.println("Please insert a integer");
            inputNum = in.nextInt();
            System.out.println("Inpunt number: " + inputNum);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

}
