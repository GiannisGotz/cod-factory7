package gr.aueb.cf.myexperiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβάζει από ένα αρχείο ακεραίων και γράφει
 * σε ένα άλλο αρχείο το άθροισμα και τον μέσο όρο.
 *
 * @author A. Androutsos
 */
public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Starting the program...");
        Scanner sc = new Scanner(new File("C:/tmp/file-numbers.txt"));
        PrintStream ps = new PrintStream("C:/tmp/file-sumofnumbers.txt");
        System.out.println("File opened successfully.");
        String token;
        int num = 0, sum = 0, count = 0;
        double average = 0.0;

        while (sc.hasNext()) {
            token = sc.next();
            System.out.println("Read token: " + token);
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        average = (double) sum / count;
        ps.printf("Το άθροισμα είναι %d%n", sum);
        ps.printf(Locale.ENGLISH, "Ο μέσος όρος είναι %.2f%n", average);

        sc.close();
        ps.close();
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
