package gr.aueb.cf.ch10mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASCIItoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of letters");
        int numLetters = scanner.nextInt();
        final List<Character> sentence = new ArrayList<>();
        char ch;


        // Convert ASCII to string values
        for (int i = 0; i < numLetters; i++ ) {

                System.out.println("Please enter a number of letter then press enter and continue:");
                int inputNum = scanner.nextInt();
                ch = (char) inputNum;
                sentence.add(ch);
        }

        for ( int i = 0; i < sentence.size(); i++ ) {
            System.out.print(sentence.get(i));
        }
    }
}


