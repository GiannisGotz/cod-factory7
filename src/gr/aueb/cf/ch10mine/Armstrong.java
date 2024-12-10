package gr.aueb.cf.ch10mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Βρίσκει αν το άθροισμα των δυνάμεων κάθε ψηφίου είναι ίσο με τον ίδιο τον αριθμό.
 * Για παράδειγμα, ο αριθμός 153 = 1^3 + 5^3 + 3^3.
 * Επομένως, το 153 είναι Armstrong number. Επίσης, τα 370, 371, 407.
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> digits = new ArrayList<>();
        int inputNumber = 0;
        int numberOfDigits=0;
        int num = 0;
        int sum = 0;
        int digit = 0;
        boolean isArmstrong = false;

        System.out.println("Please insert a number (int)");
        inputNumber = in.nextInt();

        num = inputNumber;

        do {
            numberOfDigits++;
            digit = num % 10;
            digits.add(digit);
            num = num / 10;
        } while (num != 0);
        
        for (int item : digits) {
            sum += Math.pow(item, numberOfDigits);
        }

        isArmstrong = (sum == inputNumber);

        System.out.println("Number is: " + inputNumber);
        System.out.println("Sum is: " + sum);
        System.out.printf("%d is Armstrong: %s", inputNumber, (isArmstrong) ? "YES" : "NO");
    }
}

