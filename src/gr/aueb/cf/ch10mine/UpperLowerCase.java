package gr.aueb.cf.ch10mine;

import java.util.Scanner;

/**
 * Μετατρέπει σε κεφαλαία-πεζά εναλλάξ με το 1ο κεφαλαίο
 *
 */

public class UpperLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String sentence;
        char ch;

        System.out.println("Please insert a string");
        sentence = scanner.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            ch = ((i % 2) == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
