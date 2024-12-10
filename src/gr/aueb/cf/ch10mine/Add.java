package gr.aueb.cf.ch10mine;

import java.util.Scanner;

public class Add {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int num1;
        int num2;
        String token;

        System.out.println("Play the game");

        while (true) {
            try {
            num1 = getOneNum();
            num2 = getOneNum();

            sum = add(num1, num2);
            System.out.println("Sum is " + sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            break;
            }
        }
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch ( NumberFormatException e) {
            return false;
        }
    }

    public static int getOneNum() throws Exception {
        String numStr;
        int num;

        System.out.println("Please enter an int or # for exit");
        numStr = in.nextLine().trim();
        if ( numStr.equals("#"))  throw new Exception("Exit.");
        while ( !isInt(numStr)) {
            System.out.println("Error please enter a valid integer");
            numStr = in.nextLine().trim();
            if (numStr.equals("#"))  throw new Exception("Exit.");
        }
        num = Integer.parseInt(numStr);
        return num;
    }

    public static int add(int num1, int num2) {
        return  num1 + num2;

    }

}
