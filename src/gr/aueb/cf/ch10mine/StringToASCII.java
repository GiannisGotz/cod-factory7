package gr.aueb.cf.ch10mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToASCII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        final List<Integer> sentence = new ArrayList<>();
        String input = scanner.nextLine();
        int asciiValue = 0;
        int div = 0;

        // Convert string to ASCII values
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                char ch = input.charAt(i);
                asciiValue = (int) ch;
                sentence.add(asciiValue);
            }
            if ( i > 0) {
                char ch = input.charAt(i);
                asciiValue = (int) ch;

            }
            if ( i > 1 ) {

                char ch = input.charAt(i);
                asciiValue += (int) ch;;
            }
        }

        for ( int i = 0; i < sentence.size(); i++ ) {
            System.out.println("Sentence on ASCI is: " + sentence.get(i));
        }
    }
}

