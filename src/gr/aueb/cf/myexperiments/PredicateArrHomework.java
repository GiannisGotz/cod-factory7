package gr.aueb.cf.myexperiments;

import java.util.Scanner;

public class PredicateArrHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int[6];


        PrintMenu();
        for ( int i = 0 ; i < numArr.length; i++ ) {
            numArr[i] = scanner.nextInt();
        }

        allConditionsMet(numArr);
        System.out.println(moreThanThreeEvens(numArr));


    }

    public static void PrintMenu() {
        System.out.println("Take note of the following and insert 6 integers");
        System.out.println("1. No more than 3 even numbers.");
        System.out.println("2. No more than 3 odd numbers.");
        System.out.println("3. No more than 3 consecutive numbers.");
        System.out.println("4. No more than 3 numbers with the same last digit.");
        System.out.println("5. No more than 3 numbers in the same decade.");
    }

    public static boolean moreThanThreeOdds ( int [] arr) {
        int count = 0;

        for ( int el: arr) {
            if ( el % 2 == 0) {
                count++;
            }
        }
        return count > 3;
    }

    public static boolean moreThanThreeEvens ( int [] arr) {
        int count = 0;

        for ( int el: arr) {
            if ( el % 2 != 0) {
                count++;
            }
        }
        return count >  3;
    }

    public static boolean moreThanThreeCons ( int [] arr) {
        boolean moreThanThree = false;

        for ( int i = 0; i < arr.length -3 ; i++ ) {
            if ( arr[i] == arr[i+1]-1 && arr[i] == arr[i+2]-2 && arr[i] == arr[i+3]- 3 ) {
                moreThanThree = true;
                break;
            }
        }
        return moreThanThree;
    }

    public static boolean moreThanThreeSameEndings(int [] arr ) {
        int []sameEnd = new int[10];

        for ( int i = 0 ; i < arr.length; i++ ) {
            sameEnd[ arr[i] % 10 ]++;
        }

        for ( int el : sameEnd ) {
            if ( el > 3) {
               return true;
            }
        }
        return false;
    }

    public static boolean moreThanTwoInSameDecade (int [] arr) {
        int []sameDecade = new int[10];

        for ( int i = 0 ; i < arr.length; i++ ) {
            sameDecade[ arr[i]  / 10  ]++;
        }
        for ( int el : sameDecade ) {
            if ( el > 3) {
                return true;
            }
        }
        return false;

    }

    public static void allConditionsMet(int[] arr) {
        if ( moreThanThreeOdds(arr) || moreThanThreeCons(arr)  || moreThanThreeEvens(arr)  || moreThanThreeSameEndings(arr)  || moreThanTwoInSameDecade(arr) ) {
            System.out.println("Requirements not met");
        } else {
            System.out.println("Requirements met");
        }

    }



}
